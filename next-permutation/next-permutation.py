class Solution:
    def reverse(self,arr: List[int], start: int) -> None:
        i = start
        j = len(arr) - 1
        while(i<j):
            arr[i],arr[j] = arr[j],arr[i]
            i+=1
            j-=1
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # case where it's strictly decreasing order, return increasing
        t = sorted(nums,reverse=True)
        if t == nums:
            return nums.sort()
        # len of array
        n = len(nums)
        i = n-2
        # 1 3 5 1 0
        # keep checking till you find left element arr[i-1] smaller than right arr[i]
        while(i >= 0 and nums[i] >= nums[i+1]):
            i-=1
        # check if i was actually bigger
        if i>=0:
            # another iterator
            j = n - 1
            # find next higher number than arr[i]
            while(j >= 0 and nums[j] <= nums[i]):
                j-=1
            # swap i and j
            nums[i],nums[j] = nums[j],nums[i]
        # reverse sublist
        self.reverse(nums,i+1)
                
            
            
            
        
        
        
        