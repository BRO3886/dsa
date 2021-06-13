#User function Template for python3

class Solution:

    def findMinDiff(self, A,N,M):
        A.sort()
        max_diff = A[N-1] - A[0]
        for i in range(0,N-M+1):
            small = A[i]
            large = A[i+M-1]
            # print(large,small,max_diff)
            max_diff = min(max_diff,large-small)
        
        return max_diff

# 6 7 18 18 19 34 38 39 46 50 57 59 60 61 67 71 74 84 85 88 89
# 12
# 83
# 59 - 6 = 53
# 83,53 => 53
# 60 -  = 53
# 
 

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        N = int(input())
        A = [int(x) for x in input().split()]
        M = int(input())


        solObj = Solution()

        print(solObj.findMinDiff(A,N,M))
# } Driver Code Ends