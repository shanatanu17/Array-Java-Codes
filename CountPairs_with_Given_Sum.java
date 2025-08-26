// we only count , (a[i],a[j]) as pair , not count (a[j],a[i]) as pair 


public class CountPairs_with_Given_Sum
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{30,40,20,50,60,10};
		int target = 110;
		
		
		// 1.sort the array
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=(i+1);j<arr.length;j++)
			{
			    if(arr[i] > arr[j])
				{
				    int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		//2 .apply logic
		
		int i = 0;
		int j=arr.length-1;
		
		
		int count=0;
		
		while(i < j)
		{
		    if(arr[i] + arr[j] == target)
			{
			    count++;
				i++;
				j--;
			}
			else if(arr[i]+arr[j] < target)
			{
			    i++;
			}
			else
			{
			    j--;
			}
		}
		
		
		if(count != 0)
		{
		    System.out.println(" Total no of pairs present in array of sum equals to target is "+ count);
		}
		else
		{
		    System.out.println("No such type of pairs in array whos sum becomes equals to target");
		}
		
		
	}

}