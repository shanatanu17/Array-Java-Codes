public class Maximum_sum_of_Subarray_of_size_k_Using_Sliding_Window
{
    public static void main(String ss[])
	{
		int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
		int k=3;
		int maxsum = Integer.MIN_VALUE;
		
		
		// 1 . first , find out sum of first window seperatly
		int sum =0;
		
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
		}
		
		
		// 2 ... now , iterate form k to arr.length-1
		
		// and from now , at each iteration , add next element in current window and remove the first element 
		// of previous window
		
		
		for(int i=k;i<arr.length;i++)
		{
			sum = sum + arr[i] - arr[i-k];
			
			if(sum > maxsum)
		   {
			  maxsum = sum;
		   }
		}
		
		System.out.println("MAximum sum of subarray is "  + maxsum);
		
	}
}
