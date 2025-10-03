#include<iostream>
#include<vector>
using namespace std;

class Tempp
{

public:

vector<int> findfc(int arr[] , int x, int n)
 { 
    int f = 0;
    int c = arr[n-1];

    vector<int>an;

    for(int i=0;i<n;i++)           
     { 
       if(arr[i] == x)
        { 
           f = x;
           c = x;
           an.push_back(f);
           an.push_back(c);
           break;
        }
 
       else if(arr[i] < x )
        { 
          f = arr[i];
        }

       else
        {
          c = arr[i];
          an.push_back(f);
          an.push_back(c);
          break;
        }
     }

  
 
 
 } 
 
 };





  int main()
   { 
     int arr[] = {3,4,5,7,8,10};
     int x = 5;
     int n = sizeof(arr) / sizeof(arr[0]);;

     Tempp t;

     vector<int>ans = t.findfc(arr,x,n);
     for(auto i : ans)
      { 
        cout<<i;
        cout<<endl;
      }  
   }


 
