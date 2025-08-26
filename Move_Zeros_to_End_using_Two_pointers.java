// shifting of elements we need to be done , and if we get 0 it current ith index , then we know
// we have to put it on last of array , so shift the remaining elements of array as it is .
// bcz we have to maintaing the order of remaining no-zero elements..........



public class Move_Zeros_to_End_using_Two_pointers
{
    public static void main(String ss[])
	{
	    int arr[] = new int[]{1,0,2,0,3, 55,23,67,0,11,34,98,-82};
		
		int i=0;
		int j=arr.length-1;
		
		
		while(i < j)
		{
		   if(arr[i] == 0)
		   {
		      for(int k=i;k<arr.length-1;k++)
			  {
			     arr[k] = arr[k+1];
			  }
			  
			  arr[j] = 0;
			  j--;
		   }
		   else
		   {
			   i++;
		   }
		}
		
		
		System.out.println("Print the array elements after move the zero's to end of array");
		for(int l=0;l<arr.length;l++)
		{
		    System.out.print(arr[l]+" ");
		}
	}
}