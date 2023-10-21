class Solution {
    public int uniquePaths(int m, int n) {

        // ---------------  TABULATION   ---------------------
        //  int N = n + m - 2; // 8 3
        //     int r = m - 1; //2 2
        //     double res = 1;
            
        //     // NCr =	N!/ (N-r)! r!

        //     for (int i = 1; i <= r; i++)
        //         res = res * (N - r + i) / i;  // 7*(4) 
        //     return (int)res;

   int dp[][]=new int[m][n];
     return FinduniquePaths(0,0,dp,m,n);
    }

public int FinduniquePaths(int i,int j,int dp[][],int m, int n) {

if(m==i || n==j)  return 0;
if(i == m-1 && j == n-1)return dp[i][j] = 1;
        if(dp[i][j] != 0)return dp[i][j];
        return dp[i][j] = FinduniquePaths(i+1,j,dp,m,n) + FinduniquePaths(i,j+1,dp,m,n);
}
}