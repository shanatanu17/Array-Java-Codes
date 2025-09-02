public class find_the_smallest_missing_element_from_a_sorted_array
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{31,32,33,34,36,37,39};
	  int n = arr.length;
	  
	  int last = arr[n-1];
	  int ans = -1;
	  int flag = 0;
	  
	  
	  for(int i=arr[0];i<=last;i++)
	  {
	    if(arr[i] != i)
		{
		   ans = i;
		   flag = 1;
		   break;
		}
	  }
	  
	  
	  if(flag == 1)
	  {
	     System.out.println("Answer is "+ ans);
	  }
   
   
   }

}