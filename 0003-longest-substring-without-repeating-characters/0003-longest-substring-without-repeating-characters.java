class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int  res = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        // // abcabcbb
        // for(int j=0,i=0;j<s.length();j++){
        //     if(map.containsKey(s.charAt(j)))
        //     i = Math.max(map.get(s.charAt(j)), i);

        //      res = Math.max(res, j - i + 1); 
        //      map.put(s.charAt(j), j + 1); 
            
        // }
        // return res;




       int res=0;
       HashMap<Character,Integer> hm = new HashMap<>();
       for(int right=0,left=0;right<s.length();right++){
        if(hm.containsKey(s.charAt(right)))
            left=Math.max(hm.get(s.charAt(right)),left);

         hm.put(s.charAt(right),right+1);
        res=Math.max(res,right-left+1);
       }
      
    return res;
    
    }
}
