 // Brute force approach --
 
 // t.c -- O(n^2)
 // s.c -- O(n)

public class print_next_greater_elements_in_a_given_unsorted_array
{
    public static void main(String ss[])
	{
	   int arr[] = new int[]{5,3 ,10, 9, 6, 13 , 6,2, 23,-22,-9};
	   int n = arr.length;
	   
	   int ans[] = new int[arr.length];
	   
	   
	   for(int i=0;i<n;i++)
        {
		   int flag = 0;
		   for(int j=i+1;j<n;j++)
		   {
		      if(arr[j]  > arr[i])
			  {
				     flag = 1;
	      			 ans[i] = arr[j];
					 break;
			  } 
		   }
		   
		   // if , cuurent element dosent have any greater element in the remaining array then push -1 for that element...
		   if(flag == 0)
		   {
			   ans[i] = -1;
		   }
		}
		
		
		System.out.println("print the ans array elements");
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
      	  
	   
	   
	
	
	}

}