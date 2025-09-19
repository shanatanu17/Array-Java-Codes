public class Move_all_zeros_to_the_end_of_the_array
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{0, 1, 0, 3, 12,0,0,0,43,3,22,1,-98,0};
		int n = arr.length;
		
		
		
		for(int i=0;i<n;i++)
		{
		   if(arr[i] == 0)
		   {
		      for(int j=i+1;j<n;j++)
			  {
			     arr[j-1]=arr[j];
			  }
			  
			  arr[arr.length-1] = 0;
		   }
		}
		
		System.out.println("Array elements after move 0's to end ");
		for(int i=0;i<n;i++)
		{
		   System.out.print(arr[i]+" ");
		}
		
		
		
	}
}