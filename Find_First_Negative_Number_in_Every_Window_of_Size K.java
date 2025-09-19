public class Find_First_Negative_Number_in_Every_Window_of_Size_K
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,-3,2,6,-1,4,-11,8,2};
		int k = 4;
		int n =arr.length;
		
		
		//1. This is for first window
		for(int i =0;i<k;i++)
		{
			if(arr[i] < 0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		
		
		// 2 .this is for the rest of the windows 
		for(int i=k;i<n;i++)
		{
		   for(int j=i-k+1;j<=i;j++)
		   {
		      if(arr[j] < 0)
			  {
			     System.out.println(arr[j]);
				 break;
			  }
		   }
		}
		
		
		
	}
}