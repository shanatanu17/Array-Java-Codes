// using Extra space --> to store the rotated array values
// s.c --->O(n)
// t.c ---> O(n)



public class Rotate_Array_in_clock_Wise_Direction_in_single_pass
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
		int n = arr.length;
		
		int rotate = 13;
		int k= rotate % n;
		
		
		
		
		
		int ans[] = new int[n];
		
		
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