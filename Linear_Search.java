public class Linear_Search
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{10,20,30,40,50,60,70};
		
		
		/*
		int searchkey = 78;
		int flag=0;
		
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i] == searchkey)
			{
			    flag=1;
				break;
			}
		}
		
		if(flag == 1)
		{
		    System.out.println("Element is present in array");
		}
		else
		{
		    System.out.println("Element is not present in array");
		}
		
		*/
		
		
		for(int i=arr.length-1;i>=0 ;i--)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}