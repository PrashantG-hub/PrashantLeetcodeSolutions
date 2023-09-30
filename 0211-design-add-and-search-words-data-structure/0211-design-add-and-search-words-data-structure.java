class TrieNode{
       TrieNode[] children;
       boolean isEndOfWord;

       public TrieNode(){
           children=new TrieNode[26];
           for(int i=0;i<26;i++)
           children[i]=null;

           isEndOfWord=false;
       }
}
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root=new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            curr.children[idx]=new TrieNode();

            if(i==word.length()-1)
            curr.children[idx].isEndOfWord=true;

            curr=curr.children[idx];
        }
    }
    
    public boolean search(String word) {
        return SearchHelper(root,word,0);
    }
    public boolean SearchHelper(TrieNode curr,String word,int idx){

          if(idx==word.length())
            return  curr.isEndOfWord;
            
            if(word.charAt(idx)=='.')
            {
                for(TrieNode child:curr.children){
                  if(child!=null && SearchHelper(child,word,idx+1))
                  return true;
                }
                 return false;
            }    
            else
            {
            TrieNode child=curr.children[word.charAt(idx)-'a'];
            if(child==null)
            return false;

            return SearchHelper(child,word,idx+1);
            }
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */