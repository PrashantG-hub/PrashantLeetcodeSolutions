class Solution {
    public int numDistinct(String s, String t) {
          int dp[][] = new int[s.length()][t.length()];
        for(int a[]:dp)Arrays.fill(a,-1);
        return num(s,t,0,0,dp);
    }
    public int num(String s,String t,int i,int j,int dp[][]){
        if(t.length() == j)return 1;
        if(s.length() == i)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int inc=0,exc=0;
        if(s.charAt(i) == t.charAt(j)) inc = num(s,t,i+1,j+1,dp);
        exc = num(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc; 
    }
}