public class Sliding_Window_Maximum
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
		int k = 3;
		
		int n=arr.length;
		
		
		//1.for 1st subarray
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<k;i++)
		{
		   if(arr[i] > max)
		   {
		     max = arr[i];
		   }
		}
		
		System.out.println("Maximum element from subarray is  " + max);
		
		
		// 2 . for next subarrays
		
		for(int i=k;i<n;i++)
		{
			int max1 = Integer.MIN_VALUE;
			for(int j = (i-k+1) ; j<=i ;j++)
			{
				if(arr[j] > max1)
 				{
					max1 = arr[j];
				}
			}
			
			System.out.println("Maximum element from subarray is  " + max1);
		}
		
		
		
		
		
	}
}