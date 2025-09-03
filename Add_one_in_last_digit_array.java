public class Add_one_in_last_digit_array
{
	public static void main(String ss[])
	{
	    int arr[] = new int[]{1,99};
		int i = arr.length-1;
		
		while(arr[i] == 9)
		{
			arr[i] = 0;
			
			
			arr[i-1] = arr[i-1]+1;
			
			i--;
		}
		
	   if(i == arr.length-1)
	   {
	     arr[i] =	arr[i] + 1 ;
	   }
	   
	   System.out.println("Array elements afetr adding 1 at last element");
	   for(int j=0;j<arr.length;j++)
	   {
		   
		   System.out.print(arr[j]+" ");
	   }
	}



}