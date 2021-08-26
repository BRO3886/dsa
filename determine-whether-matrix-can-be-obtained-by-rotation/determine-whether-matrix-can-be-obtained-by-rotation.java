class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        boolean[] checksum = new boolean[4];
        
        Arrays.fill(checksum, true);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] != target[i][j]) checksum[0] = false;
                if(mat[i][j] != target[n-1-j][i]) checksum[1] = false;
                if(mat[i][j] != target[n-1-i][n-1-j]) checksum[2] = false;
                if(mat[i][j] != target[j][n-1-i]) checksum[3] = false;
            }
        }
        
        return checksum[0] || checksum[1] || checksum[2] || checksum[3];
        
    }
}