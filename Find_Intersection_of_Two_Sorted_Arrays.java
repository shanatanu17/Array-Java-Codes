import java.util.*;

public class Find_Intersection_of_Two_Sorted_Arrays
{
    public static void main(String ss[])
	{
	    int arr1[] = new int[]{10,20,30,90,120,-35,0};
		int arr2[] = new int[]{40,10,50, 30,50,20,145,-35, 51, 0};
		
		
		// 1. sort both arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		//2.apply now logic
		
		int i=0;
		int j=0;
		
		while(i < arr1.length && j < arr2.length)
		{
		   if(arr1[i] == arr2[j])
		   {
		      System.out.print(arr1[i]+ " ");
		      i++;
			  j++;
		   }
		   else if(arr1[i] > arr2[j])
		   {
		      j++;
		   }
		   else
		   {
		      i++;
		   }
		}
	}
}