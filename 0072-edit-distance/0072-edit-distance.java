class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return minHelper(word1,m-1,word2,n-1,dp);
    }

    int minHelper(String word1,int i, String word2,int j,int dp[][]) {

        if(i<0)
        return j+1;
        if(j<0)
        return i+1;

       if(dp[i][j] != -1)
       return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j))
        return dp[i][j]=minHelper(word1,i-1,word2,j-1,dp);
        else
       return dp[i][j]=1+Math.min(minHelper(word1,i-1,word2,j-1,dp),Math.min(minHelper(word1,i-1,word2,j,dp),minHelper(word1,i,word2,j-1,dp))) ;

    }
}