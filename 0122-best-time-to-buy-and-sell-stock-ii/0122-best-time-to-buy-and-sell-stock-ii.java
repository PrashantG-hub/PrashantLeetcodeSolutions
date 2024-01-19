class Solution {
    public int maxProfit(int[] prices) {
        int x=prices[0],profit=0;
        
        for(int i=1;i<prices.length;i++){

           if(prices[i-1]<prices[i]){
                 profit+=prices[i]-prices[i-1];
            }
               
        }
        return profit;
    }
}

