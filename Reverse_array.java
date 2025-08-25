public class Reverse_array
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,23,35,33,22,66,55,90};
		
		int p = 0;
		
		int q = arr.length-1;
		
		
		System.out.println("Array before reverse operation ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println();
		
		
		while(p <= q)
		{
			int temp;
			temp = arr[p];
			arr[p] = arr[q];
			arr[q] = temp;
			
			p++;
			q--;
		}
		
		System.out.println("Array after reverse operation ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}