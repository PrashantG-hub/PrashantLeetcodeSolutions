class Solution {
    
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text2.length();
        int m=text1.length();
    int [][] dp = new int [m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
    }
       return CommonSubsequenceHelper(text1,m-1,text2,n-1,dp);
    }
    
    int CommonSubsequenceHelper(String text1,int i, String text2,int j, int dp[][]){

        if(i<0 || j<0)
        return 0;

       if(dp[i][j]!=-1)
       return dp[i][j];

      if(text1.charAt(i)==text2.charAt(j))
          return dp[i][j]=1+CommonSubsequenceHelper(text1.substring(0,i),i-1,text2.substring(0,j),j-1,dp);
      else
         return dp[i][j]=Math.max(CommonSubsequenceHelper(text1.substring(0,i),i-1,text2,j,dp) ,CommonSubsequenceHelper(text1,i,text2.substring(0,j),j-1,dp));

    }
}