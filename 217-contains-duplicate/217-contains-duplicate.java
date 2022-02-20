class Solution {
    public boolean containsDuplicateDict(int[] nums) {
        /*
        approaches:
        1. make a dict
        2. make set, compare length of array and set    
        */
        return false;
    
    }
    
    public boolean containsDuplicate(int[] nums) {
        // approach 2
        Set<Integer> hs = new HashSet<>();
        for(int n: nums) {
            hs.add(Integer.parseInt(""+n));
        }
        
        return hs.size() != nums.length;
    }
}