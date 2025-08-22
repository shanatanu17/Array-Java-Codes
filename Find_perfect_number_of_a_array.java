public class Find_perfect_number_of_a_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int []{6,12,34,28 , 496 , 668 , 8128};
		int n = arr.length;
		
		
		for(int i=0;i<n;i++)
		{
		    int currele = arr[i];
			int sum=0;
			int k=1;
			
			
			while(k < currele)
			{
			    if(currele % k == 0)
				{
				    sum = sum + k;
				}
			  k++;			
			}
			
			if(sum == currele)
			{
			    System.out.println(currele);
			}
		}
	
	}
}