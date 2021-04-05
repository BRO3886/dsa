#User function Template for python3

def segregateElements( arr, n):
    
    neg = [i for i in arr if i < 0]
    # print(l1)
    pos = [i for i in arr if i >= 0]
    # print(l2)
    
    if len(pos) == 0 or len(neg) == 0:
        return
    
    for i in range(len(pos)):
        arr[i] = pos[i]
        
    j = 0
    while(j<len(neg)):
        arr[i+j+1] = neg[j]
        j+=1

        

#{ 
#  Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        segregateElements(a, n)
        print(*a)

        T -= 1


if __name__ == "__main__":
    main()





    
# } Driver Code Ends