class Solution {
    int m,n;
    public int minPathSum(int[][] grid) {
        m=grid.length-1;
        n=grid[0].length-1;

        int grid1[][]=new int[m+1][n+1];
        return minPathSumHelper(grid,m,n,grid1); 
    }

     int minPathSumHelper(int[][] grid,int i,int j,int grid1[][]) {
    
     if(i==0 && j==0)
     return grid[0][0];

     else if(i<0 || j<0)
     return Integer.MAX_VALUE;

     else if(grid1[i][j]!=0)
     return grid1[i][j];

     else
     return grid1[i][j]=grid[i][j]+Math.min(minPathSumHelper(grid,i-1,j,grid1),minPathSumHelper(grid,i,j-1,grid1));
    
     }
}