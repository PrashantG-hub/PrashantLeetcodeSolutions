class Solution {
     int dp[][];
    public int minimumTotal(List<List<Integer>> triangle) {
     dp=new int[triangle.size()][triangle.size()];
         for(int[]temp:dp)
         Arrays.fill(temp,-10001);
        return findminsum(0,0,triangle);
}

    int findminsum(int row,int col,List<List<Integer>> triangle) {
     if(row==triangle.size())
     return 0;

     if(dp[row][col]!=-10001)
     return dp[row][col];

     return dp[row][col]=triangle.get(row).get(col)+Math.min(findminsum(row+1,col,triangle),findminsum(row+1,col+1,triangle));
}
}