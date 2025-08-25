import java.util.*;

public class Max_and_Min_Element
{
    public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		
	    int arr[] = new int[size];
		
		
		System.out.println("Enter the array elements ");
		// Take elements in array
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// Maximum element........
		for(int i=0;i<size;i++)
		{
		   if(arr[i] > max)
		   {
		      max = arr[i];
		   }
		}
		
		
		// Minimum element
		for(int i=0;i<size;i++)
		{
		   if(arr[i] < min)
		   {
		      min = arr[i];
		   }
		}
		
		
		System.out.println("Maximum element is " + max);
		System.out.println("Minimum element is "+ min); 
	
	}
}