import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        
        for(int num: nums){
            if (dict.containsKey(Integer.valueOf(num))){
                return num;
            }
            dict.put(Integer.valueOf(num),1);
        }
        return -1;
    }
}