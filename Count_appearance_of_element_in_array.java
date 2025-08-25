import java.util.*;

public class Count_appearance_of_element_in_array
{
    public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = new int[]{1, 2, 3, 2, 4, 2, 5 , 22,33,123,4,5,77,4,13,4,88,-46,4};
		
		System.out.println("Enter the search key ");
		int searchelement = sc.nextInt();
		int count = 0;
		
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == searchelement)
			{
				count++;
			}
		}
		
		if(count == 0)
		{
		    System.out.println("Search element is not present in array");
		}
		else
		{
			System.out.println("Search element is present for-->  " + count + "  no of times " );
		}
	
	}
}