class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        
        if n == 1:
            return nums[0]
        elif n == 2:
            return max(nums[0],nums[1])
        elif n == 3:
            return max(nums[0]+nums[2], nums[1])
        
        dp = [0]*n
        dp[n-1] = nums[n-1]
        dp[n-2] = nums[n-2]
        dp[n-3] = dp[n-1] + nums[n-3]
        
        for i in range(n-3, -1, -1):
            dp[i] = nums[i] + max(dp[i+2:])
            
        print(dp)
        return max(dp[0],dp[1])
        
        