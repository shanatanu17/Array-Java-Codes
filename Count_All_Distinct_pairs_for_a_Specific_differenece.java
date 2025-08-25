// Brute f


public class Count_All_Distinct_pairs_for_a_Specific_differenece
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{5 ,2, 3, 7, 6, 4, 9, 8};
	  int difference =3;
	  
	  
	  int n = arr.length;
	  int count=0;
	  
	  
	  for(int i=0;i<n;i++)
	  {
	    for(int j=(i+1);j<n;j++)
		 {
		    if(Math.abs(arr[i] - arr[j]) == difference)
			{
			   count++;
			   System.out.println( "["+ arr[i] + " " +arr[j] + "]");
			}
		 
		 }
	  }
	  
	  System.out.println("Total number of distinct pairs with specific difference is "  + count);
	  
	  
   
   }
}