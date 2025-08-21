public class copy_oneArray_to_anotherArray
{
   public static void main(String ss[])
   {
       int arr1[] = new int[]{10,20,30,40,50,60};
	   
	   int arr2[] = new int[arr1.length];
	   
	   
	   for(int i=0;i<arr1.length;i++)
	   {
	      arr2[i] = arr1[i];
	   }
	   
	   
	   System.out.println("Copy Array elements are ");
	   for(int i=0;i<arr2.length;i++)
	    {
		   System.out.println(arr2[i]);
		}
   }
}