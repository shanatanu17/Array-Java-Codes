public class Calculate_factorial_of_each_element
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{1,4,6,7,8 , 5};
	   
	   int n = arr.length;
	   
	   for(int i=0;i<n;i++)
	   {
	      int no = arr[i];
		  
		  int fact = 1;
		  
		  while(no != 0)
		  {
		     fact = fact * no;
			 no--;
		  }
		  
		  arr[i] = fact;
	   }
	   
	   
	   System.out.println("Array elements after repalcing with their factorial");
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	
	}

}