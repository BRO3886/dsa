class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            s.add(sentence.charAt(i));
        }
        
        if(s.size() == 26){
            return true;
        }
        
        return false;
    }
}