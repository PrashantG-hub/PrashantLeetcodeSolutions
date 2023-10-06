
class Solution {
     class TrieNode{
        TrieNode zero, one;
        public TrieNode(){
            
        }
     }
    public int findMaximumXOR(int[] arr) {
    int max = 0;
        TrieNode root = new TrieNode();
        for(int i : arr){
            insert(root, i);
        }
        for(int i : arr){
            max = Math.max(max, maxi(root, i));
        }
        return max;
    }

     public int maxi(TrieNode root, int n) {
        int max  =  0;
         TrieNode curr = root;
        for(int i = 31;i>=0;i--){
            int temp = (n&(1<<i)) != 0 ? 1 : 0;
            if(temp == 0){
                if(curr.one != null){
                    max = max|(1<<i);
                    curr = curr.one;
                }else{
                    curr = curr.zero;
                }
            }else{
                if(curr.zero != null){
                    max = max|(1<<i);
                    curr = curr.zero;
                }else{
                    curr = curr.one;
                }
            }
        }   
         return max;
    }
    
     public void insert(TrieNode root, int n) {
        TrieNode curr = root;
        for(int i = 31;i>=0;i--){
            int temp = (n&(1<<i)) != 0 ? 1 : 0;
            if(temp == 0){
                if(curr.zero == null) 
                curr.zero = new TrieNode();
                curr = curr.zero;
            }else{
                if(curr.one == null) 
                curr.one = new TrieNode();
                curr = curr.one;
            }
        }
    }

}