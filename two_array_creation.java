 import java.util.*; 
 
 public class TwoD_array_creation
 {
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   
	   int arr[][] = new int[3][3];
	   
	   System.out.println(" Enter the array elements ");
	
	   
	   for(int i=0;i<arr.length;i++)
	   {
	      for(int j=0;j<arr[i].length;j++)
		  {
		     arr[i][j] = sc.nextInt();
		  }
	   }
	   
	   
	   System.out.println("Display the array elements ");
	   
	   for(int i=0;i<arr.length;i++)
	   {
	      for(int j=0;j<arr[i].length;j++)
		  {
		     System.out.print(arr[i][j]);
		  }
		  
		  System.out.println();
	   }
	}
 }