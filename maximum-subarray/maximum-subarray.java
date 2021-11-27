class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxTillNow = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            maxTillNow = Math.max(nums[i], maxTillNow+nums[i]);
            if(maxTillNow > maxSum) {
                maxSum = maxTillNow;
            }
        }
        
        return maxSum;
    }
}