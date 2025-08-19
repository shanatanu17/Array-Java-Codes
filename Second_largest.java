public class Second_largest
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{40,50,60,22,111};
		
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(" Largest ele is " + max);
		
		
		// this is imp 
		int secmax = -1;
		
		
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] > secmax && arr[i] != max)
			{
				secmax = arr[i];
			}
		}
		
		
		System.out.println("Second maxmum is " + secmax);
		
		
		
	}

}