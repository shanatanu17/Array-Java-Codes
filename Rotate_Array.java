//T.c  = O(n) + O(n) = O(n)
//S.c = O(n)  ---> use to store the elements after rotating...


public class Rotate_Array
{
   public static void main(String ss[])
   {
      int arr1[]= new int[]{10,20,30,40,50,60,70};
	  
	  int n = arr1.length;
	  int k = 13;
	  int coorectrotating = k % n;
	  
	  
	  
	  
	  int arr2[] = new int[arr1.length];
	  int j=0;
	  
	
	  // 1.
	  for(int i=coorectrotating ;i<arr1.length;i++)
	  {
	     arr2[j] = arr1[i];
		 j++;
	  }
	  
	  // 2. 
	  for(int i=0; i<coorectrotating; i++)
	  {
	     arr2[j] = arr1[i];
		 j++;
	  }
	  
	  
	  System.out.println("Array after rotating ");
	  for(int i=0;i<arr2.length;i++)
	  {
		  System.out.print(arr2[i]+ " ");
		  
	  }
   }
}