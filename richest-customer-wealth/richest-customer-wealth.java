class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int r = 0; r < accounts.length; r++){
            int iwealth = 0;
            for(int c = 0; c < accounts[r].length; c++){
                iwealth+=accounts[r][c];
            }
            if(iwealth > maxWealth){
                maxWealth = iwealth;
            }
        }
        
        return maxWealth;
    }
}