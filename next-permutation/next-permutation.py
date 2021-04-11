class Solution:
    
    def reverse(self,nums:List[int],start:int)->None:
        i = start
        j = len(nums) -1;
        while(i<j):
            # swap nums[i] and nums[j]
            nums[i],nums[j]=nums[j],nums[i]
            i+=1
            j-=1
    
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        i = n-2
        
        # find decreasing number pos
        while (i >= 0 and nums[i+1] <= nums[i]):
            i-=1
        
        if i >=0:
            j = n -1
            # find number just larger than nums[i]
            while(j>=0 and nums[j] <= nums[i]):
                j-=1            
                
            # swap nums[i] and nums[j]
            nums[i],nums[j]=nums[j],nums[i]
            
        # reverse sublist
        self.reverse(nums,i+1)
        