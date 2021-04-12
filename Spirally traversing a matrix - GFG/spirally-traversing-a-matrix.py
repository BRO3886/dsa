
class Solution:
    #User function Template for python3
    def spirallyTraverse(self,matrix, r, c): 
        ans = []
        top = 0
        left = 0
        down = r-1
        right = c-1
        
        direction = 0
        
        while top <= down and left <= right:
            if direction == 0:
                for i in range(left,right+1):
                    ans.append(matrix[top][i])
                top+=1
            elif direction == 1:
                for i in range(top,down+1):
                    ans.append(matrix[i][right])
                right-=1
            elif direction == 2:
                for i in range(right,left-1,-1):
                    ans.append(matrix[down][i])
                down-=1
            elif direction == 3:
                for i in range(down,top-1,-1):
                    ans.append(matrix[i][left])
                left+=1
            direction = (direction + 1)%4
        
        return ans
            
                

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        r,c = map(int, input().strip().split())
        values = list(map(int, input().strip().split()))
        k = 0
        matrix =[]
        for i in range(r):
            row=[]
            for j in range(c):
                row.append(values[k])
                k+=1
            matrix.append(row)
        obj = Solution()
        ans = obj.spirallyTraverse(matrix,r,c)
        for i in ans:
            print(i,end=" ")
        print()

# } Driver Code Ends