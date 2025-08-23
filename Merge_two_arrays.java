import java.util.*;

public class Merge_two_arrays
{
    public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter size for array 1");
		int size1 = sc.nextInt();
	    int arr1[] = new int[size1];
		
		System.out.println("Enter array 1 elements ");
		for(int i=0;i<size1;i++)
		{
			arr1[i] = sc.nextInt();
		}
		

		
		
		System.out.println("Enter size for array 2");
		int size2 = sc.nextInt();
	    int arr2[] = new int[size2];
		
		System.out.println(" Enter array 2 elements ");
		for(int i=0;i<size2;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		int size3 = size1+ size2;
		
		int ans[] = new int[size3];
		
		
		int j = 0;
		// now, push the array1 ele to ans
		for(int i=0;i<size1;i++)
		{
			ans[j] = arr1[i]; 
			j++;
		}
		
		
		// now ,push the array2 ele to ans
		for(int i=0;i<size2;i++)
		{
			ans[j] = arr2[i];
			j++;
		}
		
		
		// Dispaly the ans array
		System.out.println("Merge array elements are ");
		
		for(int i=0;i<size3;i++)
		{
			System.out.print(ans[i]+" ");
		}
		
		
		
	}
}