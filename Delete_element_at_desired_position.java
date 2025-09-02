public class Delete_element_at_desired_position
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{1,2,3,4,5};
	  
	  int n = arr.length;
	  int k=1;
	  
	  System.out.println("Array elemnets before deletion of elements");
	  for(int i=0;i<n;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
	  
	  System.out.println();
	  
	  
	  for(int i=k+1;i<n;i++)
	  {
	     arr[i-1] = arr[i];
	  }
	  
	  // Reduce size of the array by 1 bcz we deleted the element from array....
	  n--;
	  
	  System.out.println("Array elements after deleteing element at desired position");
	  for(int i=0;i<n;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
   
   
   }
}