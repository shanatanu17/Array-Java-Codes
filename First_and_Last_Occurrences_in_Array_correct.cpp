#include<iostream>
#include<vector>
using namespace std;


int main()
{

  vector<int> nums = {2,2,3,3,3,3,4};

  vector<int> ans;

   int first = -1;
   int last = -1;
   int x = 2;
  
   int n = nums.size();

   for(int i=0;i<n;i++)
    { 
      if(nums[i] == x)
       { 
         if(first  == -1)
          {
            first = i;
          }
 
          last = i;
       }
    }


   ans.push_back(first);
   ans.push_back(last);



   for(auto i : ans)
    {  
       cout<<i<<" " ;
    }


return 0;
}