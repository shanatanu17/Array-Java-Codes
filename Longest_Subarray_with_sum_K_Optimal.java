// using 2 pointers approach 


public class Longest_Subarray_with_sum_K_Optimal
{
  public static int solve(int arr[],int k)
  { 
     int i=0; 
     int j=0;
     int sum = 0;
     int maxlen = Integer.MIN_VALUE;
     

     int n = arr.length;

     while(i < n && j < n)
      {
         sum = sum + arr[j];
      
         if(sum == k)
          {
            int len = j-i+1;
            
            if(len  > maxlen)
             { 
                maxlen = len;
             } 
          }

         if(sum > k)
          {
            sum = sum - arr[i];
            i++;
          }
         
        j++;
      }

     return maxlen;

  }
  


   public static void main(String ss[]) 
   {
     int arr[] = new int[]{1,2,3,1,1,1,1,3,3};
     int k = 8;
     
    int ans =  solve(arr,k);

    System.out.println("Longest_Subarray_with_sum_K length is " + ans);
     
  
 
  
 
 
   } 
}