#User function Template for python3
class Solution:
	def isPlaindrome(self, S):
	   # check length
	   # odd => ignore element at n/2 then
	   # even => reverse second half and compare with first half 
	   n = len(S)
	   first_half = S[:n//2]
	   sec_half = S[n//2:]
	   if n%2 != 0:
	       sec_half = S[n//2+1:]
	   
	   sec_half = sec_half[::-1]
	   # print(first_half,sec_half)
	   
	   if first_half == sec_half:
	       return 1
	   return 0
            
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.isPlaindrome(S)
		print(answer)

# } Driver Code Ends