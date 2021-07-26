// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


class Solution 
{
    public:
    //Function to find the minimum number of swaps required to sort the array. 
	int minSwaps(vector<int>&nums){
	    int n = nums.size(), ans = 0;
	    pair<int, int> p[n];
	    
	    for(int i  = 0; i < n; i++){
	        p[i].first = nums[i];
	        p[i].second = i;
	    }
	    
	    sort(p,p+n);
	    
	    vector<bool> visited(n,false);
	    
	    for(int i = 0; i < n; i++){
	        int oldPos = p[i].second;
	        // oldPos == i => same position as before (correct place)
	        // visited[i] = true => already visited
	        if(oldPos == i || visited[i] == true){
	            continue;
	        }
	        
	        int node = i,cycle = 0;
	        
	        while(!visited[node]){
	            visited[node] = true;
	            int next = p[node].second;
	            node = next;
	            cycle++;
	        }
	        
	        ans+=(cycle-1);
	    }
	    
	    return ans;
	}
};

// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		vector<int>nums(n);
		for(int i = 0; i < n; i++)
			cin >> nums[i];
		Solution obj;
		int ans = obj.minSwaps(nums);
		cout << ans <<"\n";
	}
	return 0;
}  // } Driver Code Ends