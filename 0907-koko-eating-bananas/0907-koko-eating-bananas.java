class Solution {
    int maxNumber(int [] piles){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<piles.length; i++){
      if(piles[i] > max){
        max = piles[i];
      }
    }
    return max;
  }

  int minTime(int []piles, int mid){
    int ans = 0;
    for(int i=0; i<piles.length; i++){
      ans += Math.ceil((double)(piles[i]) / (double)(mid));
    }
    return ans;
  }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxNumber(piles);
        while(low <= high){
          int mid = (low + high) / 2;

          if(minTime(piles, mid) <= h){
            high = mid - 1;
          }
          else{
            low = mid + 1;
          }
        }
        return low;
    }
      
}