import java.util.*;

public class twoD_array_sum
{
    public static void main(String ss[])
	{ 
	    Scanner sc = new Scanner(System.in);
		
	    int arr[][] = new int[3][3];
		
		
		System.out.println("Enter the 2d array elements ");
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
			{
			   arr[i][j] = sc.nextInt();  
			}
		}
	
	
		
		for(int i=0;i<arr.length;i++)
		{
		   int sum=0;
		   
		   for(int j=0;j<arr[i].length;j++)
		   {
		      sum = sum +arr[i][j];
		   }
		   
		   System.out.println("Row " + (i+1) + " elements sum is --->" + sum);
		}
		
		
		
		
		
	}
}