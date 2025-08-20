public class Smallest_value_in_array
{
  public static void main(String ss[])
  {
     int arr[] = new int[]{10,-34,44,189,68,-11};
	 
	 
	 int min = Integer.MAX_VALUE;
	 
	 
	 for(int i=0;i<arr.length;i++)
	 {
	    if(arr[i] < min)
		{
		  min = arr[i];
		}
	 }
	 
	 System.out.println("Minimum element is array is " + min );
  }
}