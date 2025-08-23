// In this , code subtract the array size by one after deleting the element
// by deleting one element , we want automatically size of array reduces by 1.


public class Delete_from_Specific_index
{
    public static void main(String ss[])
	{
	    int arr[]= new int[]{10,20,30,40,50};
		
		int index = 1;
		
		int n = arr.length;
		// start directly traversing the array from index+1 pos
		
		for(int i=index+1;i<arr.length;i++)
		{
		     arr[i-1] = arr[i];
		}
		
		n--;
		
		System.out.println("Display array elements after deletion");
		
		for(int i=0;i<n;i++)
		{
		   System.out.print(arr[i] + " ");
		}
		
		
	}
}