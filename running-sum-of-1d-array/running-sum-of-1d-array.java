class Solution {
    public int[] runningSum(int[] nums) {
        int[] rsum = new int[nums.length];
        rsum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            rsum[i]= rsum[i-1]+nums[i];
        }
        
        return rsum;
    }
    
}