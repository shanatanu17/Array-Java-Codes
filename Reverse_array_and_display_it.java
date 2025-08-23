import java.util.*;

public class Reverse_array_and_display_it
{
	public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Array elements before reversing the array ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// Using 2 pointers approach
		int i=0;
		int j=size-1;
		
		while(i <= j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		System.out.println();
		
		
		System.out.println("Array elements after reversing the array ");
		for(int k=0;k<size;k++)
		{
			System.out.print(arr[k]+" ");
		}


		// method 2...........................
		
		// just simply printing the array from last index to 0th index , then also we get the elemnents in reverse order..

		
		// for(int k=0;k<size;k++)
		// {
		// 	System.out.print(arr[k]+" ");
		// }
		
		
		
	}
   
}
