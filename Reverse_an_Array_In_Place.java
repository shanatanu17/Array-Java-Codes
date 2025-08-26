public class Reverse_an_Array_In_Place
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,30,40,50,60,70};
		
		int i=0;
		int j=arr.length-1;
		
		
		while(i < j)
		{
		   int temp = arr[i];
		   arr[i] = arr[j];
		   arr[j] = temp;
		   
		   i++;
		   j--;
		
		}
		
		System.out.println("Print the array after reversing the array in-place");
	    for(int k=0;k<arr.length;k++)
		{
		   System.out.print(arr[k]+ " ");
		}
	}
}