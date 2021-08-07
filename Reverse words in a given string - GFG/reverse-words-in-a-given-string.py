
# User function Template for python3

class Solution:
    
    #Function to reverse words in a given string.
    def reverseWords(self,S):
        res = S.split(".")
        n = len(res);
        for i in range(n//2):
            res[i],res[n-1-i] = res[n-1-i],res[i]
        
        return ".".join(res)

#{ 
#  Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        s = str(input())
        obj = Solution()
        print(obj.reverseWords(s))

# } Driver Code Ends