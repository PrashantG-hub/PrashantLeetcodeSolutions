class Solution {
    public int largestRectangleArea(int[] heights) {

int area=0,max=0;
        int lsmall[]=new int[heights.length];
        int Rsmall[]=new int[heights.length];
        Stack<Integer> st=new Stack<>();
       
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) lsmall[i] = -1;
            else lsmall[i] = st.peek();
            st.push(i);
        }

        // clear the stack to be re-used
        while (!st.isEmpty()) 
        st.pop();

        for (int i = heights.length-1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) 
            Rsmall[i] = heights.length;
            else 
            Rsmall[i] = st.peek();

            st.push(i);
        }

        // FINDIND MAX AREA------------
        for(int i=0;i<heights.length;i++){
           
           area= (Rsmall[i]-lsmall[i] -1)*heights[i];
           if(area>max)
           max=area;
        }

        return max;

        // BRUTE FORCE with TLE 91 testcases pass

        // int area=0,max=0;
        // int lsmall[]=new int[heights.length];
        // int Rsmall[]=new int[heights.length];
       
        // for(int i=0;i<heights.length;i++){
        //     int left=i,right=i;
        //     while(left<=heights.length-1){
        //        if(heights[i]>heights[left]){
        //        Rsmall[i]=left;  
        //        break;
        //        }
        //        if(left==heights.length-1)
        //        Rsmall[i]=heights.length;

        //        left++;
        //     }

        //     while(right>=0){
        //        if(heights[i]>heights[right]){
        //         lsmall[i]=right;  
        //         break;
        //        }
               
        //        if(right==0)
        //        lsmall[i]=-1;

        //        right--;
        //     }

        // }

        // for(int i=0;i<heights.length;i++){
           
        //    area= (Rsmall[i]-lsmall[i] -1)*heights[i];
        //    if(area>max)
        //    max=area;
        // }

        // return max;

    }
}