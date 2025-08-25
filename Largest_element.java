public class Largest_element
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,40,-23,345,5};
		
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("largest ele in array is " + max);
	}
}