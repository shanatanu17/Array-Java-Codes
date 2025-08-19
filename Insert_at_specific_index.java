import java.util.*;

public class Insert_at_specific_index
{
	public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		int flag = 0;
		
		
		// here  ,we take 1 array size extra and put only n-1 elements in array , bcz we need to shift the elements in array and 
		// that's why we need an extra space for shofting of elements
		
		 
		 
		 
		
		//1 ... insert in array
		
		System.out.println("Enter the array elemets");
		for(int i=0;i<arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		// 2 ... now , take insertele and index as input
		
		System.out.println("Enter the index where you want to insert");
		int index = sc.nextInt();
		
		System.out.println("Entee the element to insert");
		int element =sc.nextInt();
		
		
		//3 ... now , traverse from end of array and untill we got upto index where we have to insert that element.
		// and store current ele at next index .
		
		
		for(int i = arr.length-2 ; i >= index; i--)
		{
			arr[i+1] = arr[i];
		}
		
		
		// 4. we are at the index where we have to insert the element , so store it in that position
		arr[index] = element;

		
		
		// display the array after inserting the elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +  " " );
		}
	    
		
		
		
		
	}
}