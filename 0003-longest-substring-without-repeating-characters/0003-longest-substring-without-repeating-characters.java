class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        // abcabcbb
        for(int j=0,i=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j)))
            i = Math.max(map.get(s.charAt(j)), i);

             res = Math.max(res, j - i + 1); 
             map.put(s.charAt(j), j + 1); 
            
        }
        return res;
    }
}
