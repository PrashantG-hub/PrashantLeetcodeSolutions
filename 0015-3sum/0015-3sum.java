class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
               int sum = arr[i] + arr[low] + arr[high];
                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[low], arr[high]));
                }
                if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return new ArrayList<>(list);

    }
}