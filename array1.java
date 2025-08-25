import java.util.*;

public class array1
{
 public static void main(String s[])
 {
   Scanner sc = new Scanner(System.in);
 
   int arr[] = new int[5];
   
   for(int i=0;i<5;i++)
    {
	  System.out.println("Enter ele" + (i+1));
	  int ele = sc.nextInt();
	  arr[i]= ele;
	}
	
	// print one by one array ele
	
	System.out.println("Array elemets are");
	
	
	for(int i=0;i < 5;i++)
	 {
	   System.out.println(arr[i]);
	 }
 
 }

}