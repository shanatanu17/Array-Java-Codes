public class Non_zero_elements
{
  public static void main(String ss[])
  {
     int arr[] = new int[]{10,20,30,40,0, -78,45,19};
	 
	 
	 for(int i=0;i<arr.length;i++)
	 {
	    if(arr[i] != 0)
		{
		   System.out.println(arr[i]);
		}
	 }
	 
	 
  }
}