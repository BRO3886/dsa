class Solution {
public:
    int maxProduct(vector<int>& arr) {
        int n = arr.size();
        if(n == 1){
	        return arr[0];
	    }
        int max_global = arr[0];
	    int max_ending_here = arr[0], min_ending_here = arr[0];
	    
	    for(int i = 1; i<n; i++){
	        // if(arr[i] == 0){
	        //     max_ending_here = 1;
	        // min_ending_here = 1;
	        //     continue;
	        // }
	        
	        int temp = max_ending_here;
	        max_ending_here = max({arr[i], arr[i]*max_ending_here, arr[i]*min_ending_here});
	        min_ending_here = min({arr[i], arr[i]*temp, arr[i]*min_ending_here});
	        
	        if(max_global <= max_ending_here){
	            max_global = max_ending_here;
	        }
	        
	    }
	    
	    return max_global;
    }
};