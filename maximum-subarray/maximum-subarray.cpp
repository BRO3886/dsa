class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int maxTot = nums[0];
        int maxCurr = nums[0];
        
        for(int i = 1; i<n; i++){
            maxCurr = max(nums[i],nums[i]+maxCurr);
            if(maxCurr > maxTot){
                maxTot = max(maxTot,maxCurr);
            }
        }
        
        return maxTot;
    }
};