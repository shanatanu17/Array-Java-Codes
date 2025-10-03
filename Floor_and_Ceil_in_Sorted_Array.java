#include<iostream>
using namespace std;


vector<int> findfc(int arr , int x)
 { 
    int f = 0;
    int c = arr[arr.length-1];

    for(int i=0;i<arr.length;i++)           
     { 
       if(arr[i] == x)
        { 
           f = x;
           c = x;
           break;
        }
 
       else if(arr[i] < x )

  
     }
 
 
  
 
 }





  int main()
   { 
     int arr[] = {3,4,5,7,8,10};
     int x = 5;

     vector<int>ans = findfc(arr,x);
     for(auto i : ans)
      { 
        cout<<i;
        cout<<endl;
      }  
   }


 
}