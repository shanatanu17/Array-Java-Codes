public class Replace_by_5
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{10, 12, 15, 17, 20 };
	   int n = arr.length;
	   
	   
	   for(int i=0;i<n;i++)
	   {
	      if(arr[i] % 5 == 0)
		  {
		     arr[i] = 5;
		  }
	   }
	   
	   
	   System.out.println("Array elements after replacing 5 multiples with a value --> 5");
	   for(int i=0;i<n;i++)
	   {
	      System.out.print(arr[i]+" ");
	   }
	   
	   
	}
}