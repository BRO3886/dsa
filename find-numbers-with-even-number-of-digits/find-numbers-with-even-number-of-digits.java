class Solution {
    public int digits(int n){
        int ans = 0;
        while(n > 0){
            n = n/10;
            ans++;
        }
        
        return ans;
    }
    
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(digits(num)%2 == 0){
                count++;
            }
        }
        
        return count;
    }
}