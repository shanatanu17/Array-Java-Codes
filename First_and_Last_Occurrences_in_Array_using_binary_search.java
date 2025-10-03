import java.util.*;

public class First_and_Last_Occurrences_in_Array_using_binary_search
{
  public static int findfirst(int arr[],int n,int x)
   {  
    
     int low =0; 
     int high = n-1;
     int first = -1;


     while(low <= high)
      { 
        int mid = (low+high)/2;

        if(arr[mid] == x)
         { 
           first = mid;
           high = mid -1 ;
         }
 
        else if(arr[mid] < x)
         { 
            low = mid + 1;
         }

       else
        { 
           high = mid-1;
        }
 
      }  

 
   return first;
 
  }
 

 

 public static int findlast(int arr[],int n,int x)
   {  
    
     int low =0; 
     int high = n-1;
     int last = -1;


     while(low <= high)
      { 
        int mid = (low+high)/2;

        if(arr[mid] == x)
         { 
           last = mid;
           low = mid+1 ;
         }
 
        else if(arr[mid] < x)
         { 
            low = mid + 1;
         }

       else
        { 
           high = mid-1;
        }
 
      }  

 
   return last;
 
  }





  public static void main(String ss[])
   { 
     int arr[] = new int[]{2,8,8,8,8,8,11,13};

     int n = arr.length;  
     int x = 8;

     int ans1 = findfirst(arr,n,x);
     int ans2 = findlast(arr,n,x);

     ArrayList<Integer> arrl = new ArrayList<>();


     arrl.add(ans1);
     arrl.add(ans2);



     for(int var : arrl)
      { 
         System.out.println(var);
      }
    


     

     
 
 
 

 
   }



}