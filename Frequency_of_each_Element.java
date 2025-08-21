// BRUTE FORCE APPROACH
// in this , we use 2 loops to iterate on whole array and we have to print their frequency 
// so , by using some logic print it within repeat that element again.


public class Frequency_of_each_Element
{
   public static void main(String ss[])
   {
	   int arr[]= new int[]{-10,-34,22,333,-34,-10,78,95,-28};
	   
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   int count=1;
		   int flag=0;
		   
		   if(arr[i] != -1)
		 {
		   
		   for(int j=(i+1); j<arr.length ;j++)
		   {
			   if(arr[i] == arr[j])
			   {
				   count++;
				   flag=1;
				   arr[j]= -1;
			   }
		   }
		   
		 }
		 
		 else
		 {
			 continue;
		 }
		   
		   System.out.println("Count of " + arr[i] + " is -->  " + count);
	   }
   }
}