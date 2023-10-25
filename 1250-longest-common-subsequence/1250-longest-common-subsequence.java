class Solution {
    
    public int longestCommonSubsequence(String text1, String text2) {
        int j=text2.length();
        int i=text1.length();
     Integer [][] dp = new Integer [text1.length()][text2.length()];
       // return longestCommonSubsequenceHelper(text1,i-1,text2,j-1,dp);
       return count(text1, text2, text1.length()-1, text2.length()-1, dp);

    }

    public int count(String text1, String text2, int len1, int len2, Integer [][] dp) {
        if(len1 < 0 || len2 < 0)
            return 0;
        if(dp[len1][len2] != null)
            return dp[len1][len2];
        if(text1.charAt(len1) == text2.charAt(len2))
            return dp[len1][len2] = 1 + count(text1.substring(0,len1), text2.substring(0,len2), len1-1, len2-1, dp);
        else 
            return dp[len1][len2] = Math.max(count(text1.substring(0, len1), text2, len1-1, len2, dp), count(text1, text2.substring(0,len2), len1, len2-1,dp));       
    }
    
    // int longestCommonSubsequenceHelper(String text1,int i, String text2,int j, int dp[][]){

    //     if(i<0 || j<0)
    //     return 0;

    //    if(dp[i][j]!=0)
    //    return dp[i][j];

    //   if(text1.charAt(i)==text2.charAt(j))
    //       return dp[i][j]=1+longestCommonSubsequenceHelper(text1.substring(0,i),i-1,text2.substring(0,j),j-1,dp);
    //   else
    //      return dp[i][j]=Math.max(longestCommonSubsequenceHelper(text1.substring(0,i),i-1,text2,j,dp) ,longestCommonSubsequenceHelper(text1,i,text2.substring(0,j),j-1,dp));

    // }
}