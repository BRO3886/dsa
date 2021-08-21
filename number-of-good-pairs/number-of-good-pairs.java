class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
            // subtracting count value because in
            // [1,2,3,1,1,3] 
            // If there are two occurrence of element 3,
            // we can form 1 pair
            // but if there is another occurence, we have total 
            // 3 pairs (2 new, 1 old)
            // since the prev one is already counted we subtract 1
            count+=hm.get(num)-1;
        }
        
        return count;
        
        
    }
}