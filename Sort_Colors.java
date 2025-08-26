// Douch national flag problem......

        // here , we need to use 3 pointers
        // index ---> points to current element
        // left ---->  points to position where we have to set 0
        // right ----> points to position where we haev to set 2

        // we only need to write a logic for 0's and 2's ----> 1 will get automatically sorted...




public class Sort_Colors
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{2,0,2,1,1,0,1,1,2};
		
		int index=0;
		int left=0;
		int right=arr.length-1;
		
		
	    while(index <= right)
		{
			if(arr[index] == 0)
			{
				int temp=arr[index];
				arr[index] = arr[left];
				arr[left] = temp;
				
				left++;
				index++;
			}
			
			else if(arr[index] == 2)
			{
				int temp = arr[index];
				arr[index] = arr[right];
				arr[right] = temp;

                right--;				
			}
			else
			{
				index++;
			}
		}
		
		


		System.out.println("Print the array after sorting the colors");
		for(int m=0;m<arr.length;m++)
		{ 
		   System.out.print(arr[m]+" ");
		} 
	}
}