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

     while(j<n){
         char ch1=s.charAt(j);
         if(hm.containsKey(ch1)){
             if(hm.get(ch1)>0)
             count--;

            hm.put(ch1,hm.get(ch1)-1);
             
         }
         // Will shrink the window now
         while(count==0){
            if(minwindow>j-i+1){
             minwindow=j-i+1;
             minstart=i;
             }

             char ch2=s.charAt(i);
             if(hm.containsKey(ch2)){
                 hm.put(ch2,hm.get(ch2)+1);

                 if(hm.get(ch2)>0)
                 count++;
                }
             i++;
         }
         j++;
     }
     return minwindow == Integer.MAX_VALUE ? "" : s.substring(minstart, minstart + minwindow);
   
        }
       
}

 