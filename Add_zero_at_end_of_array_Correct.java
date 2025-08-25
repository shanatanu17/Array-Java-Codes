public class Add_zero_at_end_of_array_Correct
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,0,0,5,6};
		
		int j = arr.length-1;
		
		
		System.out.println("Array elements before pushing 0's at end of array");
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		for(int i=0;i<j;i++)
		{
		    if(arr[i] == 0)
			{
			    int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			    j--;
			}
		}
		
		
		System.out.println("Array elements after pushing 0's at end of array");
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	
	
	}

}