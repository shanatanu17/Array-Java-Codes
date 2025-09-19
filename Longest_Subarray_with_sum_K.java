// USing 2 loops -- Brute force
T.c - O(n^2)
s.c - O(1)


public class Longest_Subarray_with_sum_K
{

 public static int findlength(int arr[],int k)
  {

     int n = arr.length;
     int maxlen  = Integer.MIN_VALUE;


     for(int i=0;i<n;i++)
      {
         int len = 0;
         int sum = 0;

         for(int j = i; j< n ; j++)
          {
              
             sum = sum + arr[j];

             if(sum == k)
              {
                 len = j-i+1;

                 if(len  > maxlen)
                  {
                    maxlen = len;
                  } 
              }
          }
      }
 
      return maxlen;


  }
  

 

  public static void main(String ss[])
  {
   
     int arr[] = new int[]{1,2,3,1,1,1,1,4,2,3};
     int k  = 9;
  


     int ans = findlength(arr,k);


     System.out.println("Longest subarray with sum k is  " + ans);


     
 
  
 
 
 
 
  }
}