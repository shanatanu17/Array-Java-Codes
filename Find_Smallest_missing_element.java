public class Find_Smallest_missing_element
{
  public static void main(String ss[])
  {
     int arr[] = new int[]{0,1,2,3,4,5,6,8,13};
	 
	 
	 int last = arr[arr.length-1];
	 int ans = -1;
	 
	 
	 
	 for(int i=0;i<last;i++)
	 {
		 if(arr[i] != i)
		 {
			ans=i;
            break;			
		 }
	 }
	 
	 System.out.println("The smallest missing element is " + ans);
  }
}