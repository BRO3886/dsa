#User function Template for python3

class Solution:
	def prime_Sum(self, n):
		prime = [True]*(n+1)
		
		p=2
		while(p*p<=n):
		    if prime[p] == True:
		        i = p*2
		        while(i<=n):
		            prime[i] = False
		            i+=p
		    p+=1
		
		s = 0
		for i in range(2,n+1):
		    if prime[i] == True:
		        s+=i
		return s
		      
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n= int(input())
		ob = Solution()
		ans = ob.prime_Sum(n)
		print(ans)
# } Driver Code Ends