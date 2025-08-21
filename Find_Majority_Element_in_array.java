public class Find_Majority_Element_in_array
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{-45,20, 30,40,50,40,40,40};
	  
	  int maxcount = -1;
	  int maxrepeted = -1;
	 
	  
	  for(int i=0;i<arr.length;i++)
	  {
	     int count=1;
		 
		 for(int j=(i+1); j<arr.length;j++)
		 {
		    if(arr[i] == arr[j])
			  {
			     count++;
			  }
		 }
		 
		 if(count > maxcount)
		  {
		     maxcount = count;
			 maxrepeted = arr[i];
			 
		  }
	  }
	  
	  int N = arr.length-1;
	  
	  
	  if(maxcount > N/2 )
	  { 
	    System.out.println("We have a majority element in array and it is " + maxrepeted);
	  }
	  else
	  {
	    System.out.println("We dont have a majority element in array");
	  }
	  
   }
}