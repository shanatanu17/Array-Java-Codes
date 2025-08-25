public class Find_prime_numbers_in_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{8,13,4,6,23,19,17,37,39,123};
		int n = arr.length;
		
		
		for(int i=0;i<n;i++)
		{
	        int currele = arr[i];
            int count=0;
            int k=1;

            while(k <= currele)
             {
			    if(currele % k == 0)
				 {
				    count++;
				 }
			  k++;
			 }	

             if(count <= 2)
              {
			     System.out.println(arr[i]);
			  }			 
	 	}
	 
	
	}
}