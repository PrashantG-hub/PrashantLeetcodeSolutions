class Solution {
//      int dp[][];
//     public int minimumTotal(List<List<Integer>> triangle) {
//      dp=new int[triangle.size()][triangle.size()];
//         return findminsum(0,0,triangle);
// }

//     int findminsum(int row,int col,List<List<Integer>> triangle) {
//      if(row==triangle.size())
//      return 0;

//      if(dp[row][col]!=0)
//      return dp[row][col];

//      return dp[row][col]=triangle.get(row).get(col)+Math.min(findminsum(row+1,col,triangle),findminsum(row+1,col+1,triangle));
// }

 int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[triangle.size()][triangle.size()];
        for(int[]temp:dp)
         Arrays.fill(temp,-10001);
        return helper(0,0,triangle);
    }
    
    int helper(int r,int c,List<List<Integer>> triangle)
    {
        if(r == triangle.size())
            return 0;
        
        if(dp[r][c] != -10001)
            return dp[r][c];
        
        return dp[r][c] = triangle.get(r).get(c) + Math.min(helper(r+1,c,triangle),helper(r+1,c+1,triangle));
        
    }
}