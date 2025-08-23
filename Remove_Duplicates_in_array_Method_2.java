// BRUTE FORCE _____ (Without using Extra space) 


public class Remove_Duplicates_in_array_Method_2
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{87,30,40,23,23,55,87, -13, 75,-13 , -60};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=(i+1);j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					for(int k=j;k<n-1;k++)
					{
						arr[k] = arr[k+1];
					}
					
					// Here, we reduce size of array
					n--;
					
					// go again to previous element to check if again same element is present then , start to check 
					// it again...
					j--;
				}
				
			}
		}
		
		
		System.out.println("Array after removing duplicates ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}