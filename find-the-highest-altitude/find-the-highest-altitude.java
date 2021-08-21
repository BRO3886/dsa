class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        
        int ans = 0;
        int max = 0;
        for(int i=0; i< n; i++){
            ans += gain[i];
            if(ans > max){
                max = ans;
            }
        }
        
        return max;
    }
}