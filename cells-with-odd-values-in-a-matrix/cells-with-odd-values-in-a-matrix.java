class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        
        for(int[] row: mat){
            Arrays.fill(row,0);
        }
        
        for(int[] entry: indices){
            int ri = entry[0];
            int ci = entry[1];
            
            for(int col = 0; col < n; col++) mat[ri][col]++;
            
            for(int row = 0; row < m; row++) mat[row][ci]++;
        }
        
        int count = 0;
        for(int[] row: mat){
            for(int ele: row){
                if (ele%2 != 0 ) count++;
            }
        }
        
        return count;
    }
}