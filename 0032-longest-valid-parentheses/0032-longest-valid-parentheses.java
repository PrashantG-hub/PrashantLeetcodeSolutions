class Solution {
    public int longestValidParentheses(String s) {
      Stack<Integer> stk=new Stack<>();
      stk.push(-1);
      int ans=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(')
        stk.push(i);
        else{
            stk.pop();
            if(stk.isEmpty())
            stk.push(i);
            else{
              int len=i-stk.peek();
              ans=Math.max(ans,len);
            }
        }
      }
    return ans;
    }
}