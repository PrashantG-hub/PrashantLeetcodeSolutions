class Solution {
    int m,n;
    public int uniquePathsIII(int[][] grid) {
        int x=0,y=0,nonobs=0;
        m=grid.length;
        n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0)
                nonobs++;

                if(grid[i][j]==1)
                {
                    x=i;
                    y=j;
                }
            }
        }

       return Backtrack(grid,x,y,nonobs);

    }
    private int Backtrack(int[][] grid,int i, int j,int nonobs) {

     if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] ==-1)
     return 0;
        if(grid[i][j] == 2){
            return nonobs==-1 ? 1:0;
        }
        grid[i][j] = -1;
        nonobs--;
    int result= Backtrack(grid,i+1,j,nonobs) + Backtrack(grid,i-1,j,nonobs) + Backtrack(grid,i,j+1,nonobs) + Backtrack(grid,i,j-1,nonobs);
        grid[i][j] = 0;
        nonobs++;

        return result;
    }
}
