import java.util.*;


public class Binary_search_Recursive
{
  public static void main(String ss[])
   { 
     int arr[] = new int[]{3,4,6,7,9,12,16,17};

     int low = 0;
     int high = arr.length-1;
     int target = 15;

     int ans = BS(arr,low,high,target);

     if(ans != -1)
      { 
         System.out.println("Target element is present at " + ans);
      }    
     else
      { 
          System.out.println("Target element is not present in array ");
      }
   }


   public static int BS(int arr[], int low , int high , int target)
    { 
       //base case
       if(low > high)
        { 
          return -1;
        } 

      
 
       int mid = (low+high)/2;

       if(arr[mid] == target)
        {  
           return mid;
        }

       else if(arr[mid] < target)
        {
          return BS(arr,mid+1,high,target);
        }

     return BS(arr,low,mid-1,target);
    }


   
}