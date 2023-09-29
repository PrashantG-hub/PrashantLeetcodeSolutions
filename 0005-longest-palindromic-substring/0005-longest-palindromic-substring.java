class Solution {
  int start = 0;
    int end = 0;

    public String longestPalindrome(String s) {
        
        if(s.length() < 2){
            return s;
        }

        char[] c = s.toCharArray();

        for(int i=0;i<c.length;i++){
            findPalindrome(c, i, i);
            findPalindrome(c, i, i + 1);
        }
        return s.substring(start, start + end);        
    }

    private void findPalindrome(char[] c, int j, int k){
        while(j >= 0 && k < c.length && c[j] == c[k]){
            j--;
            k++;
        }

        if(end < k - j - 1){
            end = k - j - 1;
            start =j + 1;
        }
    }
}