import java.util.*;

public class Insert_at_Specific_index_Correct
{
    public static void main(String ss[])
	{
	
	    Scanner sc = new Scanner(System.in);
		
		
	    int arr[] = new int[6];
		
		
		System.out.println("Enter the index value u want to insert the element");
		int index = sc.nextInt();
		
		System.out.println("Enter the Element value to ins");
		int element= ;
		
		System.out.println("Enter the array elements which is of size n-1");
		
		for(int i=0;i<arr.length-1;i++)
		{
		   arr[i] = sc.nextInt();
		}
		
		
		// traverse from last index of array
		for(int i=arr.length-2;i>=index;i--)
		{
		      arr[i+1]= arr[i];
		}
		
		arr[index] = element;
		
		
		// display the array elements after inserting at specific index
		
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+ " ");
		}
		
		
		
		
	}
}