// Using 2 loops.....

public class Check_array_is_anagram_or_not_Brute_force
{
    public static void main(String ss[])
	{
	    int arr1[] = new int[]{1,2,89,4,5,8,9,2};
		int arr2[] = new int[]{5,3,1,4,2,8,9,2};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		
		if(n1 != n2)
		{
		    System.out.println(" Array is not anagram ");
		}
		
		int count = 0;
		
		
		for(int i=0;i<n1;i++)
		{
		    int flag=0;
			
			for(int j=0;j<n2;j++)
			{
			    if(arr1[i] == arr2[j])
				{
				    flag=1;
					count++;
					break;
				}
			}
			
			if(flag == 0)
			{
			    break;
			}
		}
		

		
		if(count == arr1.length)
		{
		    System.out.println(" Array is Anagram ");
		}
		else
		{
			System.out.println(" Array is Not  Anagram ");
		}
		
		
		
		
	}
}