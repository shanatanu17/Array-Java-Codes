public class last_index_of_search_element
{
  public static void main(String ss[])
  {
    int arr[]= new int[]{-23,45,67,45,22,-14,-34,-45,45,67,88};
	
	int searchelement = 45;
	
	int ans = -1;
	
	
	for(int i=0;i<arr.length;i++)
	{
	  if(arr[i] == searchelement)
	  {
	    ans = i;
	  }
	}
	
	if(ans != -1)
	{
	  System.out.println("Last occuring index of the search element is at index "+ ans);
	}
	else
	{
	  System.out.println("Search ele not present in array ");
	}
  }
}