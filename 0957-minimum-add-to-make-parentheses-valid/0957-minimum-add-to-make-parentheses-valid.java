class Solution {
public int minAddToMakeValid(String S) {
     int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
          if(S.charAt(i)=='(')
          bal=bal+1;
          else
          bal+=-1;

            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans++;
                bal++;
            }
        }

        return ans + bal;
}
}