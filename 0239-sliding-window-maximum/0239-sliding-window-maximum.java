class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> deque = new ArrayDeque<>();
        int x=0;
        int a[]=new int[nums.length-k+1];
          for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);

            if(deque.peekFirst()==i-k)
            deque.removeFirst();

            if(i>=k-1){
              a[x]=nums[deque.peekFirst()];
             x++;
            }
           
            
        }  
        
        // BRUTE FORCE WITH TLE----- 44/51 PASSED
        
        // int n=nums.length-k+1;
        // int a[]=new int[n];

        // for(int i=0;i<n;i++){
        //     int j=i,max=0;
        //     max=nums[i];
        //    while(j<k+i){
        //       if(nums[j]>max)
        //       max=nums[j]; 
        //       j++; 
        //     }
        //     a[i]=max;
        // }
         return a;
    }
}