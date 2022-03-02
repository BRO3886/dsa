class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        if((s.length() == 0 && t.length() != 0) || (s.length() == 0 && t.length() == 0))
           return true;
        
        if (t.length() == 0) return false;
        
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
            
            if(j >= t.length() && i < s.length()) return false;
        }
        
        return true;
    }
}