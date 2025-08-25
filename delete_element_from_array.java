// This method , uses the extra space array , where i copy and elements from one array to another copied array
// here , within traversing the array when we reach at index position then , skip that element and then continue to traverse
// the array and copy the element from arr to cparr 


public class delete_element_from_array
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,20,30,40,50,345,690};
		
		int index = 4;
		
		
		// Extra space taken here
		int cparr[] = new int[arr.length-1];
		
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i != index)
			{
			  cparr[j] = arr[i];
			  j++;
			}
			else
			{
				continue;
			}
		}
		
		
		
		System.out.println(" Array elements are ");
		
		for(int i=0;i<cparr.length;i++)
		{
			System.out.println(cparr[i]);
		}
	}
}