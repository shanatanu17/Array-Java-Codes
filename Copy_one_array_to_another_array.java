import java.util.*;

public class Copy_one_array_to_another_array
{
	public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Eneter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}	
		
		
		
		int copyarr[] = new int[size];
		
		
		
		
	   // 1 .....	copyarr = arr;   (We can directly also a=copy the array elements ....
	   
	   
	   //2 .. one by one copy array elemets and store it in answer array
	   for(int i=0;i<arr.length;i++){
	      copyarr[i] = arr[i];
	   }
	   
	   
		
		System.out.println("Display the copy array element");
		for(int i=0;i<copyarr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
	}
    
}