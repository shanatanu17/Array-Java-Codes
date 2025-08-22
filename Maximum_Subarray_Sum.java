// BRUTE FORCE APPROACH


public class Maximum_Subarray_Sum
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{3,5,-2,6,-1,-3};
		int n = arr.length;
		
		
		int maxsum = 0;
		
		for(int i=0;i<n;i++)
		{
			int sum = arr[i];
			
			for(int j=(i+1);j<n;j++)
			{
				sum = sum + arr[j];
				
				if(sum > maxsum)
				{
					maxsum = sum;
				}
				
			}
			
			
		}
		
		
		System.out.println("Maximum sum is " + maxsum);
	}
}