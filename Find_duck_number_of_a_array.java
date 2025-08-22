public class Find_duck_number_of_a_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{12,103,2,3,50 , -980,860 , 415 , 54 , 8023};
		
		int n = arr.length;
		
		
		for(int i=0;i<n;i++)
		{
		   int currele = arr[i];
		   int flag=0;
		   
		   while(currele > 0)
		   {
		      int ld = currele % 10;
			  if(ld == 0)
			   {
			      flag=1;
				  break;
			   }
			  currele = currele / 10;
		   }
		   
		   if(flag == 1)
		   {
		      System.out.println(arr[i]);
		   }
		}
	}
}