public class Find_pairs_with_difference_K
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{1, 5, 3, 4, 2};
	  int k=2;
	  
	  int n = arr.length;
	  
	  for(int i=0;i<n;i++)
	  {
	     for(int j=0;j<n; j++)
		   {
		      if(Math.abs(arr[i] - arr[j]) == k)
			    {
				   System.out.println( "("+ arr[i] + ","+  arr[j] + ")");
				}
		   }
	  }
   }
}