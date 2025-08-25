public class Search_element_in_array
{
   public static void main(String ss[])
   {
	   int arr[]= new int[]{3,5,34,54,266,971,1234,3224};
	   
	   int key = 1234;
	   
	   int left = 0;
	   int right = arr.length-1;
	   
	   int flag = 0;
	   
	   
	   
	   
	   while(left <= right)
	   {
           int mid = (left + right)/2;
		   
		   if(arr[mid] == key){
			   System.out.println("Element is present at index " + mid);
			   flag = 1;
			   break;
		   }
		   
		  else if(arr[mid] > key){
			  right = mid-1;
			   
		   }
		   
		  else{
			   left = mid+1;
		   }
		   
	   }
	   
	   
	   if(flag == 0)
	   {
		   System.out.println("Element is not present in array");
	   }

	   
	   
	   
	   
	   
	   
	   
	   
   }
}