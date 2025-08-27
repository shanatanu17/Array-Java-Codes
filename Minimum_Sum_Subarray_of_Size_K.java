public class Minimum_Sum_Subarray_of_Size_K
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
		
		int k = 4;
		int n = arr.length;
		
		int minsum = Integer.MAX_VALUE;
		int sum = 0;
		
		
		// 1. find sum of first window
		for(int i=0;i<k;i++)
		{
		   sum = sum + arr[i];
		}
		
		// Imp step
		minsum = sum;
		
		
		//2 . 
		
		for(int i=k;i<n;i++)
		{
		   sum = sum + arr[i] + arr[i-k];
		   
		   if(sum < minsum)
		   {
		      minsum = sum;
		   }
		}
		
		
		System.out.println("Minimum sum of subarray is " + minsum); 
		
		
		
	}
}