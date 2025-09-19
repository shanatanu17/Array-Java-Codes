public class Add_sorted_array_in_single_merged_array
{
   public static void main(String ss[])
   {
     int a1[] = new int[]{10,20,30,40,50};
	 int a2[] = new int[]{5,15,23,31};
	 
	 int ans[] = new int[a1.length + a2.length];
	 
	 
	 int i =0;
	 int j =0;
	 int k =0;
	 
	 
	 while(i < a1.length && j < a2.length)
	 {
	   if(a1[i] < a2[j])
	   {
	     ans[k] = a1[i];
		 i++;
		 k++;
	   }
	   else 
	   {
	     ans[k] = a2[j];
		 j++;
		 k++;
	   }
	 }
	 
	 System.out.println("Answer array after soretd a1 and a2 array");
	 
	 for(int l=0;l<ans.length;l++)
	 {
	    System.out.print(ans[l]+" ");
	 }
   
   
   }
}