class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0,nums.length-1);
        return nums;
    }
    
    public void quicksort(int[] nums, int low, int high){
        if(low<high){
          int index = partition(nums,low,high);
          quicksort(nums,low,index-1);
          quicksort(nums,index,high);
        }
    }
    
    public int partition(int[] nums, int i, int j){
        int pivot=nums[i];
        while(i<=j){
            while(nums[i]<pivot)
                i++;
                
            while(nums[j]>pivot)
                j--;

            if(i<=j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

}

