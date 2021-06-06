#User function Template for python3

def isSubset( a1, a2, n, m):
    if n >= m:
        count = 0
        for i in a2:
            if i in a1:
                count+=1
        
        if count == m:
            return "Yes"
        else:
            return "No"
        
    else:
        return "No"
    
    


#{ 
#  Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
        sz = [int(x) for x in input().strip().split()]
        n, m = sz[0], sz[1]
        a1 = [int(x) for x in input().strip().split()]
        a2 = [int(x) for x in input().strip().split()]
        
        print(isSubset( a1, a2, n, m))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends