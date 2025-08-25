
// BRUTE FORCE APPROACH

public class Triplets_with_zero_Sum
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{-1, 0, 1, 2, -1, -4};
       
	  int n = arr.length;

      for(int i=0;i<n;i++)
       {
	      for(int j=(i+1);j<n;j++)
		    {
			   for(int k=(j+1) ;k<n ;k++)
			     {
				    if(arr[i]+arr[j]+arr[k] == 0)
					  {
					     System.out.println("("+arr[i]+ "," + arr[j] + ","+ arr[k] + ")");
					  } 
				 }
			}
	   }	  
   }
}