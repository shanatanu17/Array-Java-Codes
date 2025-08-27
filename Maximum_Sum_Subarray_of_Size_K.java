import java.util.*;

public class Maximum_Sum_Subarray_of_Size_K
{
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
		
	   int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
	   
	   System.out.println("Enter the window size ");
	   int k = sc.nextInt();
	   
	   int n = arr.length;
	   int maxsum = Integer.MIN_VALUE;
	   
	   
	   int sum = 0;
	   
	   // 1.find out first subarray sum separately....
	   for(int i=0;i<k;i++)
	   {
	      sum = sum + arr[i];
	   }
	   
	   maxsum = sum;
	   
	   
	   // 2. find out other subarray sum and update accordingly the maxsum value
	   
	   // and from now , at each iteration , add next element in current window and remove the first element 
		// of previous window
		
		
	   for(int i=k;i<(n);i++)
	   {
	      sum = sum + arr[i] - arr[i-k];
		  
		  if(sum > maxsum)
		  {
		     maxsum = sum;
		  }
	   }
	   
	   
	   System.out.println(" Maximum subarray sum is "+ maxsum);
	   
	   
	}
}