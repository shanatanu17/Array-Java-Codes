public class Rotate_by_clock_Wise
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,30,40,50};
		int n = arr.length;
		int k=2;
		
		int ans[] = new int[5];
		W
		
		
		int j= 0;
		for(int i=n-k;i<n;i++)
		{
		   ans[j] = arr[i];
		   j++;
		}
		
		for(int i=0;i<n-k;i++)
		{
		    ans[j] = arr[i];
			j++;
		}
		
		System.out.println("After rotating array");
		for(int i=0;i<n;i++)
		{
		    System.out.print(ans[i]+" ");
		}
		
	
	}
}