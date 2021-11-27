class Node {
    char data;
    boolean isTerm;
    Map<Character, Node> map = new HashMap<>();
    
    Node(char data) {
        this.data = data;
        isTerm = false;
    }
}

class Trie {
    Node root;
    public Trie() {
        root = new Node('\u0000');
    }
    
    public void insert(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++){
            char w = word.charAt(i);
            if(!temp.map.containsKey(w)) {
                Node nn = new Node(w);
                temp.map.put(w,nn);
            }
            temp = temp.map.get(w);
        }
        temp.isTerm = true;
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!temp.map.containsKey(ch)){
                return false;
            }
            temp = temp.map.get(ch);
        }
        
        return temp.isTerm;
    }
    
    public boolean startsWith(String word) {
        boolean found = true;
        Node temp = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            try{
                if(!temp.map.containsKey(ch)){
                    found = false;
                }
            } catch(Exception e) {
                return false;
            }
            temp = temp.map.get(ch);
        }
        
        return found;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */