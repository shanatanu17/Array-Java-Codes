import java.util.*;

public class Two_sum_brute_force
{
  public static void main(String ss[])
  {
	  
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter size of array ");
	int size = sc.nextInt();
	
    int arr[] = new int[size];
	
	
	System.out.println("Enter array elements");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	
	System.out.println("Enter tha value of target element ");
	
	int target = sc.nextInt();
	
	int flag=0;
	
	
	
	
	
	// logic................................................................................ 
	
	
	for(int i=0;i<arr.length;i++)
	{
	  for(int j= (i+1);j<arr.length ; j++)
	   {
	     if(arr[i]+arr[j] == target)
		  {
		    System.out.println("pair found at  (" + (i  + "," +  j) + ") index");
			flag=1;
			break;
		  }
	   }
	}
	
	if(flag == 1)
	{
	  System.out.println("Pair present in array ");
	}
	else
	{
	  System.out.println("Pair not present in array ");
	}
  }
}