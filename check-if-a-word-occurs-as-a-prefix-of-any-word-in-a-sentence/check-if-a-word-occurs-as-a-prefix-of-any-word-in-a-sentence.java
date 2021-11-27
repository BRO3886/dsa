class Node {
    char data;
    int idx;
    boolean isTerm;
    Map<Character, Node> map = new HashMap<>();
    Node(char data, int idx){
        this.data = data;
        this.idx = idx;
        
    }    
}

class Trie {
    Node root;
    Trie(){
        root = new Node('\u0000', -1);
    }
    
    public void insert(String word, int idx) { 
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!temp.map.containsKey(ch)){
                Node nn = new Node(ch, idx);
                temp.map.put(ch,nn);
            }
            temp = temp.map.get(ch);
        }
    }
    
    public int isMatch(String word) {
        Node temp = root;
        boolean found = true;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            try{
                if(!temp.map.containsKey(ch)){
                    found = false;
                }
            } catch(Exception e) {
                return -1;
            }
            temp = temp.map.get(ch);
        }
        
        return found? temp.idx:-1;
    }
}

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        sentence = sentence.trim();
        String[] words = sentence.split("\\s+");
        Trie t = new Trie();
        
        for(int i = 0; i < words.length; i++){
            String w = words[i];
            System.out.println(w);
            t.insert(w, i+1);
        }
        
        return t.isMatch(searchWord);
    }
}