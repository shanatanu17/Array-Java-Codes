public class Count_Number_of_Inversion
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{10,20,30,40,50,60};
	  
	  int n = arr.length;
	  int count = 0;
	  
	  
	  for(int i=1;i<n-2;i++)
	    {
		   for(int j=(i+1) ;j<n; j++)
		     {
			    count++;
			    System.out.println( "("+ arr[i] + " "+  arr[j] + ")");
			 }
		}
		
		
		System.out.println("Total no of Inversion pairs are "  + count);
		
		
   }
}