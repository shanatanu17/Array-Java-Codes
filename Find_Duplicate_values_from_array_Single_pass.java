// bhai , bahut dang lagi hai is code ko krne me .........

import java.util.*;


public class Find_Duplicate_values_from_array_Single_pass
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,30,10,40,50,30, 79 , 30, 10, 79, -43, 76, -43 , 14,67,85,14};
		
		// 1....
		Arrays.sort(arr);
		
		System.out.println("Array after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Duplicate elements are ");
		
		int count=1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] == arr[i-1] && i < arr.length-1)
			{
				count++;
			}
			else if(i == arr.length-1 && arr[i] == arr[i-1])
			{
				count++;
				if(count >= 2)
				{
				    System.out.print(arr[i]+ " ");
                }				
			}
			else
			{
				if(count >= 2)
				{
					System.out.print(arr[i-1]+ " ");
				}
				count = 1;
			}
		}
	}
}