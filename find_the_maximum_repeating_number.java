/*
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7

*/




public class find_the_maximum_repeating_number
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{2,3, 23, 5, 3, 4, 1, 7, 7,89,23,23,145,67,23,72,23};
		
		int n = arr.length;
		int maxcount=0;
		
		int maxcountelement = -1;
		
		
		for(int i=0;i<n;i++)
		{
		   int count=1;
		   
		   for(int j=(i+1);j<n;j++)
		   {
		      if(arr[i] == arr[j])
			  {
			     count++;
			  }
		   }
		   
		   if(count > maxcount)
		    {
			   maxcount = count;
			   maxcountelement = arr[i];
			}
		}
		
		System.out.println("Maximum Repeting element from the given array is " + maxcountelement);
	}
}