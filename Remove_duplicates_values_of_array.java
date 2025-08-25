//Q18. Write a java program to remove duplicates values of array.



public class Remove_duplicates_values_of_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,30,10,50,30};
		int n=arr.length;
		
		// Extra space we take here...
		int ans[] = new int[5];
		int m = ans.length;
		int k = 0;
		
		
		for(int i=0;i<n;i++)
		{
		    int flag=0;
			
			for(int j=(i+1); j<n;j++)
			{
			    if(arr[i] == arr[j])
				  {
					 arr[j] = -1;
				     flag = 1;
					 break;
				  }
			}
			
			
			if(flag == 0 && arr[i]!= -1 )
			{
				ans[k] = arr[i];
				k++;
			}
		}
		
		System.out.println("Remaining elements in array ");
		for(int i=0;i<m;i++)
		{
			if(ans[i] != 0)
			{
			   System.out.println(ans[i]);
			}
		}
	
	}
}