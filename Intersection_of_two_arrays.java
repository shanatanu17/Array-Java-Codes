// Brute Force


public class Intersection_of_two_arrays
{
   public static void main(String ss[])
     {
	     int arr1[] =new int[]{10,20,304,55,66,32,68,92,-975,-81,-23,0};
		 int arr2[] = new int[]{15,37,59,24,304,-975,0,-23,20};
		 
		 
		  for(int i=0;i<arr1.length;i++)
		  {
		     for(int j=0 ;j<arr2.length;j++)
			    {
				   if(arr1[i] == arr2[j])
				     {
					    System.out.print(arr1[i]+" ");
					 }
				}
		  }
	 }
}