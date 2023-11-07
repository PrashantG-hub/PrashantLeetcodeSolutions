class Solution {
    public int maximalRectangle(char[][] matrix) {
        int MaxArea=0,area=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int a[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0')
                a[j]=0;
                else
                a[j]++;
            }
          area= LargestRectangle(a);
          MaxArea= Math.max(area,MaxArea);
        }

        return MaxArea;
    }

int LargestRectangle(int heights[]){
    
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

         }   
}

// 4 0 0 3 0