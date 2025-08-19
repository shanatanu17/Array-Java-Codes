public class find_maximum_and_minimum
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{-10,20,3700,4980,-500,680};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Smallest ele is " + min);
		System.out.println("LArgest ele is " + max);
		
	}
}