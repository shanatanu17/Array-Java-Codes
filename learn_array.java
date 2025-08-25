import java.util.*;

public class learn_array
{
	static int arr[];
	public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter size of array");
	
		int size = sc.nextInt();
		arr = new int[size];
		
		System.out.println("Enter the array elements ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		
		System.out.println("Array elements are ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		} 
		
		
		
		
	}
}