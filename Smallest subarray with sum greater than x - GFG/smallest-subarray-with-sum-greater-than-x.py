
class Solution:
    def sb(self, a, n, x):
        left = 0
        right = 1
        min_len = n
        
        while(right<n):
            summ = sum(a[left:right+1])
            # print(summ,left,right)
            if (summ > x):
                while(summ > x):
                    summ -= a[left]
                    left+=1
                    # print("while",summ,left,right)
                left-=1
                # print("min_len",min_len)
                min_len = min(min_len,right-left+1)
                # print("min_len",min_len)
            right+=1
            
        return min_len
        


#{ 
#  Driver Code Starts
def main():

    T = int(input())

    while(T > 0):
        sz = [int(x) for x in input().strip().split()]
        n, m = sz[0], sz[1]
        a = [int(x) for x in input().strip().split()]
        print(Solution().sb(a, n, m))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends