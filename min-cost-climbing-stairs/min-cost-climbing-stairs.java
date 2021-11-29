class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= 2 && i+j < dp.length; j++){
                min = Math.min(dp[i+j], min);
            }
            dp[i] = min + cost[i];
        }
        
        return Math.min(dp[0],dp[1]);
    }
}