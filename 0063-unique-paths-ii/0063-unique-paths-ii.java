class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
       int dp[][]=new int[m][n];
        return finduniquePathsWithObstacles(0,0,obstacleGrid,m,n,dp);
    }

    public int finduniquePathsWithObstacles(int i,int j,int[][] arr,int m, int n,int dp[][]){

     if(i==m || j==n || arr[i][j]==1) return 0;
     if(i==m-1 && j==n-1){
     if(arr[i][j]==1) 
     return 0;
     else
     return 1;
     }
    
    if(dp[i][j]!=0) return dp[i][j];
    return dp[i][j]=finduniquePathsWithObstacles(i+1,j,arr,m,n,dp)+finduniquePathsWithObstacles(i,j+1,arr,m,n,dp);
    }
}