class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void quickSort(int[] arr,int i, int j){
       if (i < j) {
			int p = partition(arr, i, j); 
            // p is fixed and call quickSort again for left and right array
			quickSort(arr, i, p-1); 
			quickSort(arr, p+1, j); 
		}
    }
    public int partition(int[] arr,int l,int h) {
        // In worst case it will be o(n^2). i.e. if data is already sorted
		// we can improve it by using middle element as pivot and then before starting
		// anything just swap it with h. so, that h will remain pivot.

		// Find mid of the array
		int mid = (l + h) / 2;
		// swap array element present in mid and h index
		swapIntArray(arr, mid, h);
		// now pivot is h again.
		// we goes from l till h-1 because h is reserved for pivot
		for (int j = l; j < h; j++) {
			if (arr[j] < arr[h]) {
				swapIntArray(arr, j, l);
				l++;
			}
		}
		// when j reached h,we know that l is in pivot position. so we just swap it
		swapIntArray(arr, h, l);
		return l;
    }
    private void swapIntArray(int[] a, int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}