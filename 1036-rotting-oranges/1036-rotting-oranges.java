class Solution {

    class Cell{
            int time,row,col;
        public Cell(int row, int col,int time){
            this.time=time;
            this.row=row;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Cell> q=new LinkedList<Cell>();
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(grid[i][j]==2)
            q.add(new Cell(i,j,0));
        }}

        int ans=0;
        int dir[][]={{0,1},{0,-1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            Cell currOrange=q.poll();
           ans=currOrange.time;
         
         for(int i=0;i<4;i++)
         {
             int nr=currOrange.row+dir[i][0];
             int nc=currOrange.col+dir[i][1];

             if(isValid(nr,nc,grid)){
                 grid[nr][nc]=2;
                 q.add(new Cell(nr,nc,currOrange.time+1));
             }
         }  

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(grid[i][j]==1)
            return -1;
        }}
        return ans;

    }
    public boolean isValid(int nr,int nc,int grid[][]){
        if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]==2 || grid[nr][nc]==0)
        return false;

        return true;
    }
}