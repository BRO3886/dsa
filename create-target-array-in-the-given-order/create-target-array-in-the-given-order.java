class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < index.length; i++){
            // System.out.println("inserting "+nums[i]+" at " + index[i]);
            list.add(index[i],nums[i]);
            // System.out.println(list.toString());
        }
        
        int[] ans = new int[list.size()];
        Iterator<Integer> itr = list.iterator();
        for(int i = 0; i < ans.length; i++) {
            ans[i] = itr.next().intValue();
        }
        
        return ans;
    }
}