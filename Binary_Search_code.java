public class Binary_Search_code
{
	public static void main(String ss[])
	{
		int arr[] = new int[]{10,-20,30,40,-570,60 , 980 , 342, 45 , 18};
		
		int searchelement = 123;
		int ans = -1;
		int flag=0;
		
		
		int left=0;
		int right=arr.length-1;
		
		
		while(left <= right){
			
			int mid = (int) (left+right)/2;
			
			
			if(arr[mid] == searchelement)
			{
				ans = mid;
				flag=1;
				break;
			}
			
			else if(arr[mid] < searchelement)
			{
				left = mid+1;
			}
			
			else
			{
				right = mid-1;
			}	
		}
		
		
		if(flag == 1){
			System.out.println("Search Element is present at "+ ans  + " index " );
		}
		else
		{
             System.out.println("Search element is not present in array ");
		}
	}

}