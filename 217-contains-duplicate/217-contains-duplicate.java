class Solution {
    public boolean containsDuplicateS(int[] nums) {
        /*
        approaches:
        1. make a dict
        2. make set, compare length of array and set    
        */
        return false;
    
    }
    
    public boolean containsDuplicate(int[] nums) {
        // approach 1
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) return true;
        }
        
        return false;
    }
    
    private boolean containsDuplicateSet(int[] nums) {
        // approach 2
        Set<Integer> hs = new HashSet<>();
        for(int n: nums) {
            hs.add(Integer.parseInt(""+n));
        }
        
        return hs.size() != nums.length;
    }
}