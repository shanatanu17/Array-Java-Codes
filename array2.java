public class array2
{
	public static void main(String s[])
	{
		
		int arr[] = new int[5];
		
		arr[0] = 8;
		arr[1] = 5;
		arr[2] = 39;
		arr[3] = 50;
		arr[4] = 71;
		
		int ceven = 0;
		int codd = 0;
		
		for(int i=0;i<5;i++)
		{
			if(arr[i] % 2 == 0)
			{
				ceven++;
			}
			else
			{
				codd++;
			}
		}
		
		
		System.out.println(" Total even no's are " + ceven );
		System.out.println(" Total odd no's are " + codd);
		
		
		
		
	}
}