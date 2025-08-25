public class Add_zero_at_start_of_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,3,0,0,6, 9, 6, 77, 0, 4};
		
		System.out.println("Array before add zero's at start");
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		
		int j = 0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i] == 0)
			{
			    int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		System.out.println("Array after add zero's at start");
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+ " ");
		}
	}
	

}