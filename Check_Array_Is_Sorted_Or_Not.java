// BRUTE FORCE 


public class Check_Array_Is_Sorted_Or_Not
{
   public static void main(String ss[])
   {
      
	  int arr[] = new int[]{10,22,33,44,55,67 , 78, 98 , 1234, 67849 , -98};
	  int n = arr.length;
	  
	  
	  int i=0;
	  int j=1;
	  
	  int flag = 0;
	  
	  while(i < n-1)
	  {
	     if(arr[i] > arr[j])
		 {
		   flag=1;
           break;		   
		 }
		 
		 i++;
		 j++;
	  }
	  
	  
	  if(flag == 1)
	  {
	    System.out.println("False");
	  }
	  else
	  {
	    System.out.println("True");
	  }
	  
	  
	  
   
   
   
   }
}