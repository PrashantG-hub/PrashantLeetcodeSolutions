class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;

        HashMap<Integer,Integer> hp = new HashMap<>();
        hp.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int i=0; i<n; i++){ // i=0
            sum = sum + arr[i];   // 3
            int diff = sum-k;   // 1

            if(hp.containsKey(diff)){
                ans = ans + hp.get(diff); // 2
            }

            hp.put(sum,hp.getOrDefault(sum,0)+1);  // 1 1
                                                   // 2 1
                                                   // 3 1
        }

        return ans;
    }
}
