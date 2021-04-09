

class Solution:
    #User function Template for python3
    
    '''
    	Your task is tocheck if the given two strings
    	are rotations of each other.
    	Function Arguments: s1 and s2 (given strings)
    	Return Type:boolean
    '''
    
    def areRotations(self,s1,s2):
        #code here
        n1 = len(s1)
        n2 = len(s2)
        
        # length not same
        if n1 != n2:
            return False
            
        
        # dividing strings
        for i in range(0,n1-1):
            front = s1[i:]
            back = s1[:i]
            con = front + back
            
            if con == s2:
                return True
    
        return False

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
    for i in range(t):
        s1=str(input())
        s2=str(input())
        if(Solution().areRotations(s1,s2)):
            print(1)
        else:
            print(0)
    
        
# } Driver Code Ends