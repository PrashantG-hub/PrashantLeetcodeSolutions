class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void quickSort(int[] arr,int i, int j){
       if (i < j) {
			int p = partition(arr, i, j); 
         
			quickSort(arr, i, p-1); 
			quickSort(arr, p+1, j); 
		}
    }
    public int partition(int[] arr,int l,int h) {
        
		int mid = (l + h) / 2;
		
		swapIntArray(arr, mid, h);
	
		for (int j = l; j < h; j++) {
			if (arr[j] < arr[h]) {
				swapIntArray(arr, j, l);
				l++;
			}
		}
		swapIntArray(arr, h, l);
		return l;
    }
    private void swapIntArray(int[] a, int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}