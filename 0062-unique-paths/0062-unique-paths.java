class Solution {
    public int uniquePaths(int m, int n) {
        //  int N = n + m - 2; // 8 3
        //     int r = m - 1; //2 2
        //     double res = 1;
            
        //     // NCr =	N!/ (N-r)! r!

        //     for (int i = 1; i <= r; i++)
        //         res = res * (N - r + i) / i;  // 7*(4) 
        //     return (int)res;
   int dp[][]=new int[m][n];
     return FinduniquePaths(dp,m-1,n-1);
    }

public int FinduniquePaths(int dp[][],int m, int n) {

if(m==0 || n==0)  return 1;
if(m<0 || n<0)   return 0;
if(dp[m][n]!=0)  return dp[m][n];
int ans1=FinduniquePaths(dp,m-1,n);
int ans2=FinduniquePaths(dp,m,n-1);
dp[m][n]=ans1+ans2;
 
return ans1+ans2;
}

}