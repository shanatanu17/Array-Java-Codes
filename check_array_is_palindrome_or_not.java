public class check_array_is_palindrome_or_not
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{1,3,3 ,1};
	   
	   int flag =0;
	   int i=0;
	   int j=arr.length-1;
	   
	   
	   while(i <= j)
	   {
	      if(arr[i] != arr[j])
		  {
		     flag = 1;
			 break;
		  }
		  
		  else
		  {
		     i++;
			 j--;
		  }
	   }
	   
	   
	   if(flag == 1)
	   {
	      System.out.println("not palindrome array");
	   }
	   else
	   {
	      System.out.println("Palindromic array");
	   }
	
	}

}