import java.util.*;

public class Merge_Two_Sorted_Arrays_No_Extra_Space_In_place
{
   public static void main(String ss[])
   {
      int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
	  int arr2[] = new int[]{2, 3, 8, 13};
	  
	  
	  // 1. we need to convert the both arrays like , the first array will contain smaller elements 
	  // than , the elements which are present in array2.
	  
	  // so, for that we have to traverse the array1 from ending and array2 from starting...
	  
	  
	  int i=arr1.length-1;
	  int j = 0;
	  
	  
	  while(i < arr1.length && j < arr2.length)
	  {
	     //1 . swap 
	      if(arr1[i] > arr2[j])
		  {
		     int temp = arr1[i];
			 arr1[i] = arr2[j];
			 arr2[j] = temp;
		  }
		  
		  //2.perform correspoding operation on both pointers
		  i--;
		  j++;
	  }
	  
	  
	  // 3 . here , we need to sort both the arrays bcz , bcz of swapping the elements are not in correct order,
	  //and we also want like the elements within same arrays are in sorted form.
	  
	  Arrays.sort(arr1);
	  Arrays.sort(arr2);
	  
	  
	  System.out.println("Now , the array 1 elements are ");
	  for(int k=0;k<arr1.length;k++)
	  {
	     System.out.print(arr1[k]+" ");
	  }
	  
	  System.out.println();
	  
	  
	  System.out.println("Now , the array 2 elements are ");
	  for(int k=0;k<arr2.length;k++)
	  {
	     System.out.print(arr2[k]+" ");
	  }
	  
	  
	  
	  
   
   }
}