#User function Template for python3
from collections import defaultdict as dd
        
class Solution:
    def getPairsCount(self, arr, n, k):
        count = 0

        d = {}
        
        for i in arr:
            if i not in d:
                d[i] = 0
        # d = dd(int)
        
        
        for i in range(n):
            x = k-arr[i]
            if x in d:
                if d[x] == 0:
                    d[arr[i]] = d[arr[i]] + 1
                else:
                    count = count + d[x]
                    d[arr[i]]=d[arr[i]]+1
        
        return count
        
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, k = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.getPairsCount(arr, n, k)
        print(ans)
        tc -= 1

# } Driver Code Ends