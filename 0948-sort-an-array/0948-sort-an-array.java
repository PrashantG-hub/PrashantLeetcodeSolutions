class Solution {
    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}