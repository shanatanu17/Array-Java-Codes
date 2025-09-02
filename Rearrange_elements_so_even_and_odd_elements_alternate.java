public class Rearrange_elements_so_even_and_odd_elements_alternate
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{11,31,41,61,71,22,44,56,72,90,-43,-66};
	   int n = arr.length;
	   
	   
	   int ans[] = new int[n];
	   
	   
	   int i = 0;
	   int j =1;
	   
	   
	   for(int curr = 0; curr < n; curr++)
	   {
	      if(arr[curr] % 2 != 0)
		  {
		     ans[j] = arr[curr];
			 j=j+2;
		  }
		  
		  else
		  {
		     ans[i] = arr[curr];	
			i=i+2;
		  }
	   }
	   
	   
	   System.out.println("Array elements after rearrenging elements ");
	   for(int k =0;k<ans.length;k++)
	   {
	      System.out.print(ans[k]+" ");
	   }
	
	}

}