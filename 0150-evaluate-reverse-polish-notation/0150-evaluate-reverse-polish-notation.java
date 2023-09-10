class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                int ans = applyOperator(val1, val2, tokens[i]);
                stack.push(ans);
                continue;
            }
            stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.peek();
    }

    public int applyOperator(int val1, int val2, String operator) {
        switch (operator) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                return val1 / val2;
        }
        return 0;
    }
}