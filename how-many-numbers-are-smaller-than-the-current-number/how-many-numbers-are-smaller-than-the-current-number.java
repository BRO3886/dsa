class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        
        int[] copy = nums.clone();
        
        Arrays.sort(copy);
        
        for(int i = 0; i < n; i++){
            hm.putIfAbsent(copy[i],i);
        }
        
        for(int i = 0; i < n; i++){
            copy[i] = hm.get(nums[i]);
        }
        
        return copy;
    }
}