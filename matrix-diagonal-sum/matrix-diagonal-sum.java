class Solution {
    public int diagonalSum(int[][] arr) {
        int sum = 0;
        int n= arr.length;
        for(int i = 0; i < n; i++){
            sum+=arr[i][i];
        }
        
        for(int j = n-1, i = 0; j >= 0; j--, i++){
            sum+=arr[i][j];
        }
        
        
        return n%2 == 0 ? sum : sum-arr[n/2][n/2];
    }
}

// 1  2  3  4
// 5  6  7  8
// 9  10 11 12
// 13 14 15 16