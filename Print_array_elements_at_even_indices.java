public class Print_array_elements_at_even_indices
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,20,30,40,50,60};
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Elements at even indices " + arr[i]);
			}
		}
		
		
	}
	
}