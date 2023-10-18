class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-2);
        return FindCoins(coins,amount,dp);
    }
    public int FindCoins(int[] coins, int amount, int[] dp){
    int ans=Integer.MAX_VALUE;
    if(amount<0) return -1;
        if(amount==0) return 0;
        if(dp[amount]!=-2)
        return dp[amount];

        for(int i=0;i<coins.length;i++){
          int val=  FindCoins(coins,amount-coins[i],dp);
           if(val!=-1)
           ans=Math.min(ans,val);
        }
        return dp[amount]=(ans==Integer.MAX_VALUE)?-1:ans+1;
    }
}