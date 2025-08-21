public class Common_Elements_between_two_arrays
{
   public static void main(String ss[])
   {
      int arr1[] = new int[]{10,20,30,40,50,60, -8};
	  int arr2[] = new int[]{30,70,-8,130,170,40};
	  
	  
	  for(int i=0;i<arr1.length;i++)
	  {
	     for(int j = 0 ;j< arr2.length ; j++)
		  {
		     if(arr1[i] == arr2[j])
               {
			      System.out.println(arr1[i]);
				  break;
               }			   
		  }
	  }
   }
}