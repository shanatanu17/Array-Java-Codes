import java.util.*;

public class Check_array_is_anagram_or_not_Method2_single_pass
{
	public static void main(String ss[])
	{
		
		int arr1[] = new int[]{1,2,3,4,5,76,38};
		int arr2[] = new int[]{5,3,76,4,2,1};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		if(n1 != n2)
		{
			System.out.println(" Arrays Not Anagram Bcz of both arrays dont have same number of elements ");
		}
		
		// 1 . sort both arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//2. perform the operations
		
		int flag =0;
		
		for(int i=0;i<n1;i++)
		{
			if(arr1[i] != arr2[i])
			{
				flag=1;
				break;
			}	
				
		}
		
		if(flag == 1)
	   {
			System.out.println("Not anagram");	
	   }
	   else
	   {
		   System.out.println(" Anagram ");
	   }
	}
}