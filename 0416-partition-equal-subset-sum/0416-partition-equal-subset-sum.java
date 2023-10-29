class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];
    
        if(sum%2==1)
        return false;
        else
        sum=sum/2;
     Boolean dp[][]=new Boolean[nums.length][sum+1];
     return findsubset(nums,0,sum,dp);
    }

    boolean findsubset(int[] nums,int i,int sum,Boolean[][] dp){

     if(sum==0)
     return true;

     if(i==nums.length-1){
      if(nums[i]==sum)
      return true;
      return false;
     }

     if(dp[i][sum]!=null)
     return dp[i][sum];
     
     boolean Nottake=findsubset(nums,i+1,sum,dp);
     boolean take = false;
        if(sum >= nums[i]){
            take = findsubset(nums,i+1,sum-nums[i],dp);
        }
     return dp[i][sum]= Nottake||take;

    }
}