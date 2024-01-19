class Solution {
    public int maxProfit(int[] prices) {
        int i,z=0,x,c=0;                
        x=prices[0];
        
        for(i=0;i<prices.length;i++){
          if(x>prices[i])
              x=prices[i];
              else if(x<prices[i])
              {
                  if((prices[i]-x)>z)
                  z=prices[i]-x;
              }
          
        }
        return z;
    }
}