// class Trie {
//     ArrayList<String>al;
//     /** Initialize your data structure here. */
//     public Trie() {
//         al=new ArrayList<>();
        
//     }
    
//     /** Inserts a word into the trie. */
//     public void insert(String word) {
//         al.add(word);
//     }
    
//     /** Returns if the word is in the trie. */
//     public boolean search(String word) {
//         if(al.contains(word))
//             return true;
//         else 
//             return false;
//     }
    
//     /** Returns if there is any word in the trie that starts with the given prefix. */
//     public boolean startsWith(String prefix) {
//         for(int i=0;i<al.size();i++){
//             if(al.get(i).startsWith(prefix)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

 class TrieNode {

    private TrieNode[] nodeLinks;
    public boolean isEnd;

    public TrieNode() {
        nodeLinks = new TrieNode[26];
    }

    public boolean containsKey(char ch) {
        return nodeLinks[ch -'a'] != null;
    }
    public TrieNode get(char ch) {
        return nodeLinks[ch -'a'];
    }
    public void put(char ch, TrieNode node) {
        nodeLinks[ch -'a'] = node;
    }
}

class Trie {

    /** Initialize your data structure here. */
    private TrieNode root;

    public Trie() {
         root = new TrieNode();
    }
   
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.isEnd = true;
    }
   
    private TrieNode searchWordInLinks(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
           char curLetter = word.charAt(i);
           if (node.containsKey(curLetter)) {
               node = node.get(curLetter);
           } else {
               return null;
           }
        }
        return node;
    }
   
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchWordInLinks(word);
        return node != null && node.isEnd;
    }
   
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchWordInLinks(prefix);
        return node != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */