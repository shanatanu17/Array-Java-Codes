// simply by iterating on array , we check how much times we get 1's maximum number of times in a serial order..

public class Find_Maximum_consecutive_once
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{1,1,0,1,1,1,0 ,0, 1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1, 0,0,0,1,1,1,1,0};
	  
	  int maxcount=Integer.MIN_VALUE;
	  int count=0;
	  
	  
	 
	  for(int i=0;i<arr.length;i++)
	  {
	     if(arr[i] == 1)
		 {
		    count++;
		 }
		 else
		 {
		    count = 0;
		 }
		 
		 if(count > maxcount)
		  {
		     maxcount = count;
		  }
	  }
	  
	  System.out.println("Maximum consecutive once in array is "+ maxcount);
	  
	  
	  
	  
   }
}