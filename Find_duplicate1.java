// BRUTE FORCE APPROACH

public class Find_duplicate1
{
  public static void main(String ss[])
  {
  
  
    int arr[] = new int[]{10,20,30,40,50};
	int flag = 0;

    for(int i=0; i<arr.length ;i++)
    {
	  for(int j=(i+1);j<arr.length;j++)
	  {
	    if(arr[i] == arr[j])
		{
		  System.out.println("Duplicates are " + arr[i]);
		  flag =1;
		}
	  }
	}
	
	
	if(flag == 0)
	{
	  System.out.println("No any duplicate element in array");
	}


    	
  }
  
}