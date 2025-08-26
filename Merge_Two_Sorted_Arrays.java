public class Merge_Two_Sorted_Arrays
{
    public static void main(String ss[])
	{
	   int arr1[] = new int[]{10,20,30};
	   int arr2[] = new int[]{40,50,60,70};
	   
	   
	   // array to store the merge array..
	   int ans[] = new int[arr1.length + arr2.length];
	   
	   
	   int i=0;
	   int j= arr1.length;
	  
	   int k=0;
	   int l=0;
	   
	   
	   while(k <arr1.length || l <arr2.length)
	   {
		   if(k < arr1.length)
		   {
	         ans[i] = arr1[k];
		   }
		   
		   if(l < arr2.length)
		   {
		      ans[j] = arr2[l];
		   }
		   
		   k++;
		   l++;
		   i++;
		   j++;
	   }
	   
	   
	   System.out.println("Answer array elements ");
	   
	   for(int m = 0;m <ans.length ; m++)
	   {
	       System.out.print(ans[m]+" ");
	   }
	   
	   
	   
	
	}
}