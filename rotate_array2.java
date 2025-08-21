public class rotate_array2
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,20,30,40,50,60,70};
		
		System.out.println("Before Rotating the array now the array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		
		int k= 3;
		int i= 0;
		int j= k-1;
		
		int temp = 0;
		
		while(i <= j)
		{
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		
		int l = k;
		int m = arr.length-1;
		int temp1 = 0;
		while(l <= m)
		{
			temp1 = arr[l];
			arr[l] = arr[m];
			arr[m] = temp1;
			
			l++;
			m--;
		}
		
		
		
		int n = 0;
		int o = arr.length-1;
		int temp2 = 0;
		while(n <= o)
		{
			temp2 = arr[n];
			arr[n] = arr[o];
			arr[o] = temp2;
			
			n++;
			o--;
		}
		
		
		System.out.println("Array after rotate ");
		for(int s=0;s<arr.length;s++)
		{
			System.out.print(arr[s]+" ");
		}
		
		
		
		
		
	}
}