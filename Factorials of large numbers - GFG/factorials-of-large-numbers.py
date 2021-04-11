#User function Template for python3

class Solution:
    def do_factorial(self, N):
        if N == 1:
            return 1
        else:
            return N*self.do_factorial(N-1)
    
    def factorial(self,N):
        ans = self.do_factorial(N)
        ans = str(ans)
        a = [int(i) for i in ans]
        return a
        

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t=int(input())
    for _ in range(t):
        N = int(input())
        ob = Solution()
        ans = ob.factorial(N);
        for i in ans:
            print(i,end="")
        print()
    
# } Driver Code Ends