public class missing_ele
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,4,6, 10, 16 , 19 };
		
		int last = arr[arr.length-1];
		
		
		
		int j=1;
		int i=0;
		
		
		while(j <= last)
		{
			
			if(arr[i] == j)
			{
				j++;
				i++;
			}
			else
			{
				System.out.print(j + " ");
				j++;
			}
		}
		
		
		
		
	}
}