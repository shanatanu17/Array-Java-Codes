public class Minimum_element
{
	public static void main(String ss[])
	{
		int arr[]=new int[]{-23,34,-1,562,129,-82,75};
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		
		System.out.print("Minium element is " + min);
	}
}