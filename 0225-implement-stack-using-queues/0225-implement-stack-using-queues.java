class MyStack {
      int c=0;
      Queue<Integer> queue;
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        int s=queue.size();
        for(int i=1;i<s;i++){
            c=1;
           int n=queue.poll();
            queue.add(n);
        }
        
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
       return queue.peek();
    }
    
    public boolean empty() {
        if(queue.isEmpty())
        return true;

        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */