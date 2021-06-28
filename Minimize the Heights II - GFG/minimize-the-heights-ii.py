#User function Template for python3

class Solution:
    def getMinDiff(self, arr, n, k):
        arr.sort()
        ans = arr[n-1]-arr[0]
        for i in range(n-1):
            if (arr[i+1] >= k):
                currMin = min(arr[i+1]-k,arr[0]+k)
                currMax = max(arr[i]+k,arr[n-1]-k)
                ans = min(ans,currMax-currMin)
        
        return ans
       
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        k = int(input())
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.getMinDiff(arr, n, k)
        print(ans)
        tc -= 1

# } Driver Code Ends