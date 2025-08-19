import java.util.*;

public class search_element_in_array_Linear_search
{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner(System.in);
		
		int arr[] = new int[]{10,20,30,40,110,89};
		
		
		System.out.println("Enter the element to search ");
		int findele = sc.nextInt();
		
		
		int flag = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == findele)
			{

				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element found in array");
		}
		else
		{
			System.out.println("Element not found in array");
		}
		
		
	}
}