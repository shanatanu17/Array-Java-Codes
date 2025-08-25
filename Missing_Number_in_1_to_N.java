public class Missing_Number_in_1_to_N
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{1, 2, 4, 5 , 7 , 10 , 14};
	  
	  int N = arr.length;
	  
	  int i = 0;
	  int j = 1;
	  
	  while(i < N)
	  {
	     if(arr[i] == j)
		  {
		    j++;
			i++;
		  }
		  else
		  {
		    System.out.print(j+ " ");
			j++;
		  }
	  }
   }
}