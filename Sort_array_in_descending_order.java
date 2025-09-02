public class Sort_array_in_descending_order
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{23,45,-78,99,145,86,1};
	  int n = arr.length;
	  
	  
	  System.out.println("Array before sorting the elements in descending order");
	  for(int i=0;i<n;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
	  
	  
	  System.out.println();
	  
	  
	  
	  for(int i=0;i<n;i++)
	  {
	     for(int j=(i+1); j<n;j++)
		 {
		    if(arr[i] < arr[j])
			{
			   int temp = arr[i];
			   arr[i]  = arr[j];
			   arr[j] = temp;
			}
		 }
	  }
	  
	  
	  System.out.println("Array after sorting the elements in descending order");
	  for(int i=0;i<n;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
	  
	  
	  
	  
   }
}