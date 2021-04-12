class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        d = {}
        for num in nums:
            if num in d:
                return num
            d[num] = 1
        return -1