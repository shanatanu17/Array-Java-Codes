public class Binary_search
{
  public static void main(String ss[])
  {
     int arr[] = new int[]{5,8,14,22,45,51,59,68,70,74,79};
	 
	 int n = arr.length;
	 
	 int i = 0;
	 int j = n-1;
	 int key =70;
	 
	 while(i < j)
	 {
	    int mid = (i+j)/2;
		
		if(arr[mid] == key)
		{
		   System.out.println("Element found");
		   break;
		}
		
		else if(arr[mid] < key)
		{
		  i = mid+1;
		}
		
		else
		{
		   j = mid-1;
		}
	 }
  
  
  }
}