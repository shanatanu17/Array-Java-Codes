public class Merge_Array_Using_Two_pointers_Approch
{
    public static void main(String ss[])
	{
	     int arr1[] = new int[]{10,20,30};
		 int arr2[] = new int[]{40,50,60};
		 
		 int ans[] = new int[arr1.length + arr2.length];
		 
		 int i=0;
		 int j=arr1.length;
		 
		 
		 for(int k= 0;k<arr1.length;k++)
		 {
		     ans[i] = arr1[k];
			 ans[j] = arr2[k];
			 i++;
			 j++;
		 }
		 
		 
		 System.out.println(" Print the merge array ");
		 for(int l=0;l<ans.length;l++)
		 {
		    System.out.print(ans[l]+" ");
		 }
		 
	}
}