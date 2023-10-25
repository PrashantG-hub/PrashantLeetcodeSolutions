class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1=new String();
        int m=s.length();
        for(int i=m-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
    int [][] dp = new int [m][m];
    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            dp[i][j]=-1;
        }
    }
  
     return PallindromeHelper(s,m-1,s1,m-1,dp);

    }

     int PallindromeHelper(String text1,int i, String text2,int j, int dp[][]){

        if(i<0 || j<0)
        return 0;

       if(dp[i][j]!=-1)
       return dp[i][j];

      if(text1.charAt(i)==text2.charAt(j))
          return dp[i][j]=1+PallindromeHelper(text1.substring(0,i),i-1,text2.substring(0,j),j-1,dp);
      else
         return dp[i][j]=Math.max(PallindromeHelper(text1.substring(0,i),i-1,text2,j,dp) ,PallindromeHelper(text1,i,text2.substring(0,j),j-1,dp));

    }
}