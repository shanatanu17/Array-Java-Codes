public class Binary_search_lower_bound
{
  public static void main(String ss[])
   { 
      int arr[] = new int[]{1,2,3,3,7,8,9,9,9,11};
      int x = 9;

      int ans = BSLB(arr,x);
      System.out.println("Lower bound for x in array is " + ans);
   }

  
   public static int BSLB(int arr[] , int x)
    {
      int low = 0;
      int high = arr.length-1;
      int ans = arr.length;


      while(low <= high)
       { 
         int mid = low + (high - low) / 2;

         
         if(arr[mid] >= x)
          { 
             high = mid-1; 
             ans = mid;
          }
 
         else
          { 
             low = mid+1;
          }
       }  

      return ans; 

    }


}