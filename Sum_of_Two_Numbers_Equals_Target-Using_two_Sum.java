import java.util.*;

public class Sum_of_Two_Numbers_Equals_Target_Using_two_Sum
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{30,20,60,50,10,40};
		
		int target = 80;
		
		
		int i=0;
		int j=arr.length-1;
		
		// 1. sort the array
		Arrays.sort(arr);
		
		
		//2.apply logic
		
		int flag = 0;
		
		while(i <= j)
		{
		    if(arr[i] + arr[j] == target)
			{
			    flag = 1;
			    System.out.println(arr[i] + " " + arr[j]);
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
