public class Merge_array
{
public static void main(String ss[])
{
	int arr1[] = new int[]{10,20,30,40};
	int arr2[] = new int[]{50,60,70,80};
	
	int arr3[] = new int[8];
	
	int j = 0;
	
	for(int i=0;i<arr1.length;i++)
	{
		arr3[j] = arr1[i];
		j++;
	}
	
	
	for(int i=0;i<arr2.length;i++)
	{
		arr3[j] = arr2[i];
		j++;
	}
	
	
	System.out.println("Array 3 elements " );
	
	for(int i=0;i<arr3.length;i++)
	{
		System.out.print(arr3[i]+ " " );
	}
		
}
}