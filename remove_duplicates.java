// In this code We use a extra space to store the non-duplicate elements , 
// ( BRUTE FORCE APPROACH) 

// t.c =  O(n^2)
//sc = O(n);




public class remove_duplicates
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{10,20,30,10,40,50,20};
	  
	  
	  // This , extra space we use to store the elements which are not duplicates...(ans[])
	  int ans[] = new int[arr.length-1];
	  int k=0;
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  int count=0;
		  
		  if(arr[i] != -1)
		  {
			for(int j=(i+1);j<arr.length;j++)
		     {
			   if(arr[i] == arr[j])
			    {
				  count++;
				  arr[j] = -1;
			    }
		     }
		  
		    if(count == 0)
		    {
			 ans[k] = arr[i];
			 k++;
		    }	  
		  }
		
		  else
		  {
			continue;
		  }
		  
		  
	  }
	  
	  System.out.println();
	  System.out.println("Print the array elements after removal of duplicate elements ");
	  
	  for(int i=0;i<ans.length;i++)
	  {
		  System.out.println(ans[i]);
	  }
	  
	  
	  
	  
   }
}