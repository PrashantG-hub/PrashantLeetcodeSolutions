class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        pq.add(nums[i]);
        
        while(k>0){
            k--;
            pq.add(pq.poll()*-1);
        }
        while(!pq.isEmpty()){
            sum=sum+pq.peek();
            pq.poll();
        }
        return sum;
    }
}