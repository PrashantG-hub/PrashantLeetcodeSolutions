class MyQueue {
      Stack<Integer> stk;
    public MyQueue() {
        stk=new Stack<>();
    }
    
    public void push(int x) {
         Stack<Integer> stk2 = new Stack<>(); 
        while(!stk.isEmpty()){
            stk2.push(stk.pop());
        }

        stk.push(x);

        while(!stk2.isEmpty()){
            stk.push(stk2.pop());
        }
    }
    
    public int pop() {
        return stk.pop();
    }
    
    public int peek() {
        return stk.peek();
    }
    
    public boolean empty() {
        if(stk.isEmpty())
        return true;

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */