import java.util.*;

public class Check_if_Subarray_with_Given_Sum_Exists
{
   public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);
	  
      int arr[]= new int[]{1,3,2,6,-1,4,1,8,2};
	  int k=4;
	  
	  System.out.println("Enter the for subarray sum which you want to find in array ");
	  int findsum = sc.nextInt();
	  int sum = 0;
	  int n = arr.length;
	  
	  int flag = 0;
	  
	  
	  // 1. 
	  for(int i=0;i<k;i++)
	  {
	     sum = sum + arr[i];
		 
		 if(sum == findsum)
	    { 
	      flag = 1;
		  break;
	    }
	  }
	  
	  
	  
	  
	  //2. 
	  for(int i=k;i<n;i++)
	  {
		sum = sum + arr[i] - arr[i-k];
		
		if(sum == findsum)
	    { 
	      flag = 1;
		  break;
	    }
	  }
	  
	  
	  if(flag == 1)
	  {
	     System.out.println("Given sum of subarray is present in aray");
	  }
	  else
	  {
	     System.out.println("Given sum of subarray is not present in aray");
	  }
	  
	  
	  
	  
	  
   }
}
