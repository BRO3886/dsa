class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        d = {}
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        
        for i in nums:
            count = d[i]
            if count > 1:
                return i