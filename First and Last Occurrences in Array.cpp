#include<iostream>
using namespace std;


int main()
{

  vector<int> nums = {2,4,6,8,8,11,13};

  vector<int> ans;

   int first = -1;
   int last = -1;
   int x = 8;
  
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



   for(auto i : nums)
    {  
       cout<<i<<endl;
    }


return 0;
}