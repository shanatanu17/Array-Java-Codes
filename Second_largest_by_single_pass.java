public class Second_largest_by_single_pass
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,20,30,40,50,60};
		
		
		// by single pass
		
		int max = arr[0];
		int secmax = Integer.MIN_VALUE;
		 
		
		// traverse the array from 1 index
		for(int i = 1 ; i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				secmax = max;
				max = arr[i];
			}
			
			else if( arr[i] > secmax && arr[i] != max )
			{
				secmax = arr[i];
			}
		}
		
		System.out.println("Second Maximum ele " + secmax);
		
		
		
	}

}