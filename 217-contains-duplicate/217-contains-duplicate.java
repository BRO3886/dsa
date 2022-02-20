import java.util.Random;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        approaches:
        1. make a dict
        2. make set, compare length of array and set    
        */
        Random r = new Random();
        
        if(r.nextBoolean()) return approach1(nums);
        
        return approach2(nums);
    
    }
    
    private boolean approach1(int[] nums) {
        // approach 1 - map
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) return true;
        }
        
        return false;
    }
    
    private boolean approach2(int[] nums) {
        // approach 2 - set
        Set<Integer> hs = new HashSet<>();
        for(int n: nums) {
            hs.add(Integer.parseInt(""+n));
        }
        
        return hs.size() != nums.length;
    }
}