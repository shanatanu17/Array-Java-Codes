public class Find_strong_number_of_a_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,2,34,145,3332 , 40585 , 7383 , -36 , -876};
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
		    int currele = arr[i];
			int sum = 0;
			
			while(currele > 0)
			{
			   int ld = currele % 10;
			   int fact=1;
			   
			   while(ld > 0)
			   {
			      fact = fact * ld;
				  ld--;
			   }
			   
			   sum = sum + fact;
			   currele = currele / 10;
			}
			
			if(sum == arr[i])
			{
			    System.out.print(arr[i]+" ");
			}
		}
	}
}