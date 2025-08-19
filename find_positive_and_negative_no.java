public class find_positive_and_negative_no
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,20,3,40,-23,-46 -89 , 0 , 67, 26 , -879};
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > 0)
			{
				System.out.println("Positive no " + arr[i]);
			}
			else if(arr[i] < 0)
			{
				System.out.println("Negative no " + arr[i]);
			}
			else
			{
				System.out.println("Zero   " + arr[i]);
			}
		}
	}
}