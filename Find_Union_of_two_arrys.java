import java.util.*;

public class Find_Union_of_two_arrys
{
    public static void main(String ss[])
	{
	   int arr1[] = new int[]{10,20,30,50,30,40,40,50,60};
	   int arr2[] = new int[]{10,20,20,20,30,50,60,60,60,70,80};
	   
	   
	   // 1.sort the both arrays
	   Arrays.sort(arr1);
	   Arrays.sort(arr2);
	   
	   
	   //2.apply logic here.......
	   
	   int i=0;
	   int j=0;
	   


	   while(i < arr1.length || j < arr2.length)
	   {
		 
		 
	      if((i< arr1.length && j<arr2.length) &&  arr1[i] == arr2[j])
		  {
		     System.out.print(arr1[i]+" ");
			 i++;
			 j++;
		  }
		  else if((i< arr1.length && j<arr2.length) && arr1[i] < arr2[j])
		  {
			 if(arr1[i-1] != arr1[i])
			 {
		      System.out.print(arr1[i]+" ");
			 }
			 i++;
		  }
		  else
		  {
		     if(arr2[j-1] != arr2[j])
			 {
		      System.out.print(arr2[j]+" ");
			 }
			 j++;
		  }
	   }
	   
	   System.out.println();
	   System.out.println("i value "+ i);
	   System.out.println("j value "+ j);
	   
	   
	}

}