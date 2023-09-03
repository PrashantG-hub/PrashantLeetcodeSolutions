class Solution {
   List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       powerS(0, new ArrayList<>(), nums);
        return list;
    }

    private void powerS(int i, ArrayList<Integer> currentSubset, int[] arr) {
        if (i == arr.length) {
            list.add(new ArrayList<>(currentSubset)); // Add a copy of the current subset to the result
            return;
        }

        // Include the current element in the subset
        currentSubset.add(arr[i]);
        powerS(i + 1, currentSubset, arr);

        // Exclude the current element from the subset
        currentSubset.remove(currentSubset.size() - 1);
        powerS(i + 1,  currentSubset, arr);
    }
}


