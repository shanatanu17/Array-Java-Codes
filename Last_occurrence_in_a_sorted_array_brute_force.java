// using linear search

class Search
{
  int findkey(int arr[], int n , int key)
   { 
     int ans = -1;

     // as we have to find out the last oocurance of key , we can optimized the finding the answer by , 
    // simply traversing the array from end , bcz array is already sorted , when while traversing the first element we get same as key element that means , that index is last occurance


     for(int i=n-1;i>=0;i--)
      {  
        if(arr[i] == key)
         {  
           ans = i;
           break;
         }
      }
 
     return ans; 
   }



}


public class Last_occurrence_in_a_sorted_array_brute_force
{
  public static void main(String ss[])
  { 
     int arr[] = new int[]{4,13,20,40};
     Search obj = new Search();
     int key = 21;

     int n = arr.length;

     int ans = obj.findkey(arr,n,key);

    if(ans == -1)
    {
     System.out.println("Key element is not present in array");
    }
    else
    { 
      System.out.println("Key element is present in array and his last occurance is at index " + ans);
    }

 
 

  } 
}