public class find_even_and_odd_elements
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{11,2223,333,448,55,66,0,88};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println("Even no-->" + arr[i]);
			}
			else
			{
				System.out.println("Odd no-->" + arr[i]);
			}
		}
	}
}