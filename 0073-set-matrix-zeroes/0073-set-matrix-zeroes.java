class Solution {
    public void setZeroes(int[][] matrix) {

        // SPACE COMPLEXITY O(m+n)
        
        //  List<Integer> row=new ArrayList<>();
        // List<Integer> col=new ArrayList<>();
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==0)
        //         {
        //             row.add(i);
        //             col.add(j);
        //         }
        //     }
        // }

        // for(int i=0;i<row.size();i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         matrix[row.get(i)][j]=0;
        //     }

        //     for(int k=0;k<matrix.length;k++){
        //         matrix[k][col.get(i)]=0;
        //     }
        // }

        // O(1) SPACE COMPLEXITY

        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }

    }
}