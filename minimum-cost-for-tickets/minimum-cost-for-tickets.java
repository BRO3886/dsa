class Solution {
    int[] costs;
    Integer[] memo;
    Set<Integer> daySet;
    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        daySet = new HashSet<>();
        
        for(int d: days) daySet.add(d);
        
        return recurse(1);
    }
    
    public int recurse(int i){
        if(i > 365) return 0;
        
        if(memo[i] != null) return memo[i];
        
        int ans;
        if(daySet.contains(i)){
            ans = Math.min(recurse(i+1)+costs[0],Math.min(recurse(i+7)+costs[1],recurse(i+30)+costs[2]));
        } else {
            ans = recurse(i+1);
        }
        
        memo[i] = ans;
        
        return ans;
    }
}