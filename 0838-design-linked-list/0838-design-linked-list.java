  class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

class MyLinkedList {
      
     Node head ;
     int size=0;
    public MyLinkedList() {
        head=new Node(0);
        size=0;
    }
    
    public int get(int index) {
        if(index>=size)
        return -1;
       
       Node curr=head.next;
       for(int i=0;i<index;i++){
         curr=curr.next;
       }
       return curr.val;
    }
    
    public void addAtHead(int val) {
       Node curr=head.next;
       head.next=new Node(val);
       head.next.next=curr;
       size++; 
    }
    
    public void addAtTail(int val) {
        Node curr=head;
        while(curr.next!=null){
          curr=curr.next;
        }
       curr.next=new Node(val);
       size++;

    }
    
    public void addAtIndex(int index, int val) {
     if(index>size)
     return ;
    
    Node t1=head;
     for(int i=0;i<index;i++){
         t1=t1.next;
     }
     Node t2=t1.next;
     t1.next=new Node(val);
     t1.next.next=t2;
     size++;

    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)
        return;
       Node t1=head;
        for(int i=0;i<index;i++){
         t1=t1.next;
        }
        Node t2=t1.next;
        t1.next=t2.next;
        t2.next=null;
       size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */