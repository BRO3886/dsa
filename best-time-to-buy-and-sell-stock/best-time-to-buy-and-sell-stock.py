class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxm_till_now = 0
        l = 0
        r = 1
        n = len(prices)
        if n == 1:
            return 0
        if n == 2:
            return max(maxm_till_now,prices[r]-prices[l])
        while(r < n):
            if prices[l] > prices[r]:
                l = r
            else:
                maxm_till_now = max(maxm_till_now,prices[r]-prices[l])    
            r+=1
                
                
        
        return maxm_till_now