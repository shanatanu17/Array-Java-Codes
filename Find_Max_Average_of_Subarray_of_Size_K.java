import java.util.*;

public class Find_Max_Average_of_Subarray_of_Size_K
{
   public static void main(String ss[])
   {
	  Scanner sc = new Scanner(System.in);
	  
      int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
	  
	  System.out.println(" Enter the size of subarray ");
	  int k = sc.nextInt();
	  int n = arr.length;
	  
	  int sum = 0;
	  int maxavg = Integer.MIN_VALUE;
	  
	  //1. for first subarray
	  for(int i=0;i<k;i++)
	  {
		  sum = sum + arr[i];
		  
		 int avg = sum/k;
		 
		 if(avg > maxavg)
		 {
		    maxavg = avg;
		 }
	  }
	  
	  
	  // 2. for the remaining sub array 
	  for(int i=k;i<n;i++)
	  {
	     sum = sum + arr[i] - arr[i-k];
		 
		 int avg = sum/k;
		 
		 if(avg > maxavg)
		 {
		    maxavg = avg;
		 }
	  }
	  
	  
	  System.out.println("Maximum avg sum of subarray is  " + maxavg);
	  
   }
}