class Findsol
{

   int find(int arr[] , int n, int key)
   {  
     
     int low = 0;
     int high = n-1; 
     int ans = -1;
 
    
     while(low <= high)
     { 
       int mid = low + (high-low)/2;

       if(arr[mid] == key)
        { 
          ans = mid;
          low = mid+1;
        }
 
       else if(arr[mid] < key)
        {  
          low = mid + 1;
        }

       else
        { 
          high = mid - 1; 
        } 
     }
   
     return ans;
 
 
   }




}



public class Last_occurrence_in_a_sorted_array
{
  public static void main(String ss[])
   { 
     int arr[] = new int[]{3,4,13,13,20,40};

     Findsol obj = new Findsol();

     int n = arr.length;
     int key = 60;

     int ans = obj.find(arr,n,key);

     if(ans == -1)
      { 
        System.out.println("key element is not present in array");
      }
 
    else
     {
      System.out.println("The last occurance of a element is present at the index " + ans);
     }
   }

}