class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> s = new Stack<>();
        Set<String> set = Set.of("+", "-", "*", "/");

        for(String i : tokens)
        {
            if(set.contains(i))
            {
                int a = s.pop();
                int b = s.pop();
                int c = 0;
                if(i.equals("+") ) c = b + a;
                else if(i.equals("-") ) c = b - a;
                else if(i.equals("*") ) c = b * a;
                else c = b / a;

                s.push(c);
            }
            else {
                s.push(Integer.parseInt(i));
            }
        }
        return s.peek();
    }
}