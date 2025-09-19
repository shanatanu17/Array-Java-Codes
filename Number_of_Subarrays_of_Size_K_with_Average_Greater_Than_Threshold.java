// Q ....Number of Subarrays of Size K with Average Greater Than Threshold
//  Count how many subarrays of size k have an average greater than a given threshold.

// code is correct and implemented by ourself..........


import java.util.*;

public class Number_of_Subarrays_of_Size_K_with_Average_Greater_Than_Threshold
{
   public static void main(String ss[])
   {
	  Scanner sc = new Scanner(System.in);
      int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
	  
	  int n=arr.length;
	  
	  System.out.println(" Enter the size of k ");
	  int k = sc.nextInt();
	  
	  System.out.println("Enter the threshold value ");
	  int threshold = sc.nextInt();
	  
	  int count = 0;
	  int sum = 0;
	  
	  int avg = 0;
	  
	  // 1. for first window
	  for(int i=0;i<k;i++)
	  {
	     sum = sum + arr[i];
		 
		 avg = sum / k;
		 
		 if(avg > threshold)
		 {
		    count++;
     	 } 
	  }
	  
	  
	  // 2. for the remaining windows
	  
	  for(int i=k;i<n;i++)
	  {
	     sum = sum + arr[i] - arr[i-k];
		 
		 avg = sum / k;
		 
		 if(avg > threshold)
		  {
		    count++;
		  }
	  }
	  
	  
	  System.out.println("Total number of times the average of subarray is greater than threshold value "+ count);
	  
   }
}