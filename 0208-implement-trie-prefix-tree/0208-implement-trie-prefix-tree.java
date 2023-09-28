class TrieNode{
       TrieNode[] children;
       boolean eow;

       public TrieNode(){
           children=new TrieNode[26];
           for(int i=0;i<26;i++)
           children[i]=null;

           eow=false;
       }
}

class Trie {
    TrieNode root;
    public Trie() {
      root=new TrieNode();  
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';  
    // if current node is null, then add the value and change root to that value---------------------------------       
            if(curr.children[idx]==null)
             curr.children[idx]=new TrieNode();

             if(i==word.length()-1)
             curr.children[idx].eow=true;
            
            curr=curr.children[idx];
     // ----------------------------------------------------------------------------------------------         
        }
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a'; 
          if(curr.children[idx]==null)
          return false;

          if(curr.children[idx].eow==false && i==word.length()-1 )
          return false;

          curr=curr.children[idx];
        }
        return true;
    }
    
    public boolean startsWith(String prefix) {
         TrieNode curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a'; 
          if(curr.children[idx]==null)
          return false;

          curr=curr.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */