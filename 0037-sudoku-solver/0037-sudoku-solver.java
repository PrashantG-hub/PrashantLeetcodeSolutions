class Solution {
    public void solveSudoku(char[][] board) {
        SudokuSolver(board);
        return;
    }

    boolean SudokuSolver(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

            if(board[i][j]=='.'){
             for(char c='1';c<='9';c++){
                 if(IsValid(board,i,j,c))
                   {
                    board[i][j]=c;
                   if(SudokuSolver(board)) 
                     return true;
                     else
                     board[i][j]='.';
                    }

                }
                return false; 
                }
            }
        }
        return true;
    }

   boolean IsValid(char[][] board,int row,int col,char c) {
       for(int i=0;i<9;i++){
           if(board[i][col]==c)
           return false;
           
           if(board[row][i]==c)
           return false;

           if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==c)
           return false;
     
       }
       return true;
   }
}