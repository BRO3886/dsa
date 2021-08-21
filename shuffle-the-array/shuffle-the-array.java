class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        // x
        for(int i=0, j = 0; i < n*2; i+=2, j++){
            ans[i] = nums[j];
        }
        // y
        for(int i=1, j = n; i < n*2; i+=2,j++){
            ans[i] = nums[j];
        }
        
        return ans;
    }
}