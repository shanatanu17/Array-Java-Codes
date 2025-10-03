public class  find_all_unique_triplets_in_the_array
{
   public static int solve(int arr[] , int k)
   {
       int n = arr.length;
	   
	   int i =0;
	   int j=0;
	   int sum = 0;
	   int count = 0;
	   
	   while(i < n && j < n)
	   {
	      sum = sum + arr[j];
		  
		  if(sum == k)
		  {
		     count++;
		  }
		  
		  else if(sum > k)
		  {
			 sum = sum - arr[i];
		     i++; 
		  }
		  
		  j++;
	   } 
	    
	   return count;
   }



   public static void main(String ss[])
   {
     int arr[] = new int[]{-1,0,1,2,-1,-4};
	 int k = 0;
	 int count = solve(arr,k);
     System.out.println("NO of unique triplets are " + count);
	 
   }
}