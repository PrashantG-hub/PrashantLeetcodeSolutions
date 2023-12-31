class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        return Indices(numbers,target);
    }

    int[] Indices(int[] nums,int target){
        int a[]=new int[2];
        int low=0,high=nums.length-1;
        while(low<=high){
         if((nums[low]+nums[high])>target)
         high--;
         else if((nums[low]+nums[high])<target)
         low++;
         else
         {
             a[0]=low+1;
             a[1]=high+1;
             break;
         }
         
        }
        return a;
    }
}
