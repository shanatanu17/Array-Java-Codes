public class check_array_palindrome_or_not
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{101,202,303,404,33,202,101};
		
		int flag = 0;
		
		
		int i=0;
		int j = arr.length-1;
		
		
		while(i <= j)
		{
			if(arr[i] == arr[j])
			{
				i++;
				j--;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("Palindrome array");
		}
		else
		{
			System.out.println(" Not Palindrome array ");
		}
	}
}