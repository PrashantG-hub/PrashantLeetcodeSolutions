class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();

        if (s == null || t == null || n == 0 || t.length() == 0 || n < t.length()) 
            return "";

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<t.length();i++)
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        
        return FindMinimumSubString(hm,n,s,t);
    }
        String FindMinimumSubString(HashMap<Character,Integer> hm, int n,String s,String t){
          int j=0,i=0,count=t.length(),minstart=0,minwindow=Integer.MAX_VALUE;
        String result="";

      // s = "ADOBECODEBANC", t = "ABC"

      while (j <n) {
            char ch_j = s.charAt(j);
            if (hm.containsKey(ch_j)) {
                if (hm.get(ch_j) > 0)
                    count--;
                hm.put(ch_j, hm.get(ch_j) - 1);
            }

            while (count == 0) { // try to shrink the window
                if (minwindow > j - i + 1) {
                    minwindow = j - i + 1;
                    minstart = i;
                }

                char ch_i = s.charAt(i);
                if (hm.containsKey(ch_i)) {
                    hm.put(ch_i, hm.get(ch_i) + 1);
                    if (hm.get(ch_i) > 0)
                        count++;
                }
                i++;
            }
            j++; // Don't ever forget this :-)
        }
        return minwindow == Integer.MAX_VALUE ? "" : s.substring(minstart, minstart + minwindow);
     
        }
       
}

 