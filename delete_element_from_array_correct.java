public class delete_element_from_array_correct
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{10,20,30,40,50};
	  
	  int index = 1;
	  
	  
	  for(int i=index+1;i<arr.length;i++)
	  {
	     arr[i-1] = arr[i];
	  }
	  
	  System.out.println("Print the array ");
	  for(int i=0;i<arr.length-1;i++)
	  {
		  System.out.println(arr[i]);
	  }
	  
	  
   }
}