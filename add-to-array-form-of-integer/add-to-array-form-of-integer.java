class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int N = num.length;
        int curr = k;
        List<Integer> ans = new ArrayList<>();
        int i = N;
        while(--i >= 0 || curr > 0){
            if(i>=0) curr += num[i];
            ans.add(curr%10);
            curr = curr/10;
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}