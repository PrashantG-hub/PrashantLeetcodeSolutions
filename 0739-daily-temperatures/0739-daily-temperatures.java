class Solution {
    public int[] dailyTemperatures(int[] num) {
        Stack<Integer> st=new Stack<>();
        int lsmall[]=new int[num.length];

       for(int i=num.length-1;i>=0;i--){
           while(!st.isEmpty()  && num[st.peek()]<=num[i]){
             st.pop();
           }
          
           if(st.isEmpty())
           {
               st.push(i);
               lsmall[i]=0;
           }
           else{
               lsmall[i]=st.peek()-i;
                st.push(i);
           }
       }

    return lsmall;
    }
}