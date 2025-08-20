public class Last_occurance_of_element_using_binary_search
{
  public static void main(String ss[])
  {
     int arr[] = new int[]{10,20,20,30,30,30,30,30,30,30,30,30,30};
	 
	 
	 int left=0;
	 int right=arr.length-1;
	 int flag=0;
	 
	 // ans variable used to store the index of last occurance of searchelement.
	 int ans = -1;
	 
	 int searchelement = 20;
	 
	 
	 while(left <= right)
	 {
	   int mid = (int)((left+right)/2);
	   
	   if(arr[mid] == searchelement)
	   {
	      ans = mid;
		  flag=1;
		  left = mid+1;
	   }
	   
	   else if(arr[mid] < searchelement)
	   {
	     left = mid+1;
	   }
	   
	   else
	   {
	     right = mid-1;
	   }
	 }
	 
	 
	 
	 if(flag == 1)
	 {
	    System.out.println("Search element last occurance is present at " + ans + " index ");
	 }
	 else
	 {
	    System.out.println("Search element is not present in array ");
	 }
	 
  }
}