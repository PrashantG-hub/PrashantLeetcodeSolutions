class Solution {
    public int longestValidParentheses(String s) {
        int left=0,right=0,ans=0;
   for(int i=0;i<s.length();i++){
     
     if(s.charAt(i)=='(')
     left++;
     else
     right++;
     
     if(right==left){
    int len=right+left;
     ans=Math.max(ans,len);
     }
     
     if(right>left)
      left=right=0;
     
   }
   left=0;
   right=0;
   for(int i=s.length()-1;i>=0;i--){
     
     if(s.charAt(i)=='(')
     left++;
     else
     right++;
     
    if(right==left){
    int len=right+left;
     ans=Math.max(ans,len);
     }
     
     if(left>right)
     left=right=0; 
     
   }
return ans;

// -------------TC -- O(N),   SC-- O(N)-----------------------------------------------------------

    //   Stack<Integer> stk=new Stack<>();
    //   stk.push(-1);
    //   int ans=0;
    //   for(int i=0;i<s.length();i++){
    //     if(s.charAt(i)=='(')
    //     stk.push(i);
    //     else{
    //         stk.pop();
    //         if(stk.isEmpty())
    //         stk.push(i);
    //         else{
    //           int len=i-stk.peek();
    //           ans=Math.max(ans,len);
    //         }
    //     }
    //   }
    // return ans;
    }
}