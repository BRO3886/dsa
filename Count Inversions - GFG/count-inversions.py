class Solution:
    #User function Template for python3
    
    # arr[]: Input Array
    # N : Size of the Array arr[]
    #Function to count inversions in the array.
    def inversionCount(self, arr, n):
        temp = [0]*n
        return count_merge(arr,temp,0,n-1)

def merge(arr,temp,left,mid,right):
    i = left
    k = left
    j = mid
    
    inv_count = 0

    while i <= mid - 1 and j <= right:
        if arr[i] <= arr[j]:
            temp[k] = arr[i]
            i+=1
            k+=1
        else:
            temp[k] = arr[j]
            j+=1
            k+=1
            
            inv_count += mid - i
            
    while i <= mid - 1:
        temp[k] = arr[i]
        i+=1
        k+=1
    
    while j <= right:
        temp[k] = arr[j]
        j+=1
        k+=1
    
    for i in range(left,right+1):
        arr[i] = temp[i]
        
            
    return inv_count

def count_merge(arr, temp, left, right):
    inv_count = 0
    
    if left < right:
        mid = (left+right)//2
        inv_count += count_merge(arr,temp,left,mid)
        inv_count += count_merge(arr,temp,mid+1,right)
        
        inv_count += merge(arr,temp,left,mid+1,right)
    
    return inv_count

#{ 
#  Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for tt in range(t):
        n = int(input())
        a = list(map(int, input().strip().split()))
        obj = Solution()
        print(obj.inversionCount(a,n))
# } Driver Code Ends