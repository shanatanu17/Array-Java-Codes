// Brute force Approach 


public class Maximum_sum_of_Subarray_of_size_k_Brute_force
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
		
		int maxsum  =Integer.MIN_VALUE;
		int n = arr.length;
		int k = 3;
		
		
		// outer loop runs , for no of times the window is create
		for(int i=0;i<(n-k);i++)
		{
		    int sum = 0;
			
			// inner loop runs for , within a window for current ith element , to calculate the sum of current window..
			for(int j=i;j<(i+k);j++)
			{
			    sum = sum + arr[j];
			}
			
			if(sum  > maxsum)
			{
			    maxsum = sum;
			}
		}
		
		
		System.out.println("Maximum sum of subarray of size k  " + maxsum);
		
	}
}