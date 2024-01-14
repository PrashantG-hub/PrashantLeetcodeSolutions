class Solution {
    public int trap(int[] height) {
        int sum=0;
        int a[]=new int[height.length];
        int b[]=new int[height.length];
        int x=height[0],y=height[height.length-1];
        for(int i=0;i<height.length;i++){
         if(height[i]>=x){
          x=height[i];
         }
         a[i]=x;
        }

         for(int i=height.length-1;i>=0;i--){
         if(height[i]>=y){
          y=height[i];
         }
         b[i]=y;
        }
       for(int i=0;i<height.length;i++){
            int min=Math.min(a[i],b[i]);
           sum+=min-height[i];

        }
        return sum;
    }
}
