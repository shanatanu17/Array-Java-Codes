import java.util.*;

public class Sum_of_Two_Numbers_Equals_Target_Using_two_Sum
{
    public static void main(String ss[])
	{
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = new int[6];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int target = 80;
		
		
		// 1. sort the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1); j<arr.length ;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
                    arr[j]  =temp;					
				}
			}
		}
		
		
		int i=0;
		int j=arr.length-1;
		
		
		//2.apply logic
		
		int flag = 0;
		
		while(i <= j)
		{
		    if(arr[i] + arr[j] == target)
			{
			    flag = 1;
			    System.out.println("Two elements we get ---> >   " + arr[i] + " " + arr[j]);
				break;
			}

            else if(arr[i] + arr[j] < target)
            { 
			    i++;
			}		
            else
             {
			     j--;
			 }				
		}
		
		
		if(flag == 0)
		{
		    System.out.println("elemets are not present in array which can make sum of target");
		}
		
    }	
}
