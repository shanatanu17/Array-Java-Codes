import java.util.*;

public class Sum_of_Array_Elements
{
    public static void main(String ss[])
	{
		 Scanner sc =new Scanner(System.in);
		
		 System.out.println("Enetr the value for size of array ");
		 int size = sc.nextInt();
		
	     int arr[] = new int[size];
		 int sum = 0;
		 
		 System.out.println("Enter the array elements ");
		 for(int i=0;i<size;i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 
		 
		 System.out.println();
		 
		 
		 
		 for(int i=0; i<size;i++)
		 {
			 sum = sum + arr[i];
		 }
		 
		 System.out.println("Sum of the array elements is " + sum);
		 
	}
}