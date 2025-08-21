public class Sort_in_Descending_order
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{10,12,432,6,21,9,66,90,111,31,66, 12};
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j=i+1;j<arr.length;j++)
		   {
		      if(arr[i] < arr[j])
			    {
				  int temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
				}
		   }
	  }
	  
	  
	  System.out.println("After sorting the array , now the array elements are ");
	  
	  for(int i=0;i<arr.length;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
   }
}