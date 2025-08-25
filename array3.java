import java.util.*;

public class array3
{
public static void main(String s[])
 {
   Scanner sc = new Scanner(System.in);	 
	 
   int arr[] = new int[5];
   int sum = 0;
   
   System.out.println("Enter array elements");
   
   for(int i=0;i <5 ; i++)
   {
	 int ele = sc.nextInt();
     arr[i] = ele; 
   }
   
   System.out.println("Array elements  sum is ");
   
   for(int i=0;i<5;i++)
   {
	   sum = sum + arr[i];
   }
   
   System.out.println(sum);
   
   


      
 }
}