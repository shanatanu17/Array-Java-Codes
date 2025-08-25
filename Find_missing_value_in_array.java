public class Find_missing_value_in_array
{
  public static void main(String ss[])
  {
     int arr[] = new int[]{1,13,41,55};
	 
	 
	 // this is done , bcz we need to check which is the last element of array and by considering that element 
	 // we need to print the missing element 
	 int last = arr[arr.length-1];
		
	 int i=0;
	 int j=1;
	 
	 
	 while(i <arr.length)
	 {
		 if(arr[i] == j)
		 {
			 i++;
			 j++;
		 }
		 else
		 {
			 System.out.print(j+" ");
			 j++;
		 }
	 }
	 
	 
	 
	 
  }
}