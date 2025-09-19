public class Remove_Duplicates_from_Sorted_array_USing_two_pointers
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,20,40,40,50,50,50,60,60,70,70,70,110,150,150,150,210,240,300};
		
		int size = arr.length;
		
		int i=0;
		int j=1;
		
		
		while(i < size-1)
		{
		    if(arr[i] == arr[j])
			{
			    for(int k=j;k<arr.length-1;k++)
				{
			      arr[k] = arr[k+1];
				}
				
				size--;
			}
			
			else
			{
			   i++;
			   j++;
			}
		}
		
		
		System.out.println("Array elements after removal ");
		for(int l=0;l<size;l++)
		{
		    System.out.print(arr[l]+" ");
		}
		
		
	}
}