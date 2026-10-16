class Node{
    int val;
    Node next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}


class MyCircularQueue {
    int count=0;
    int max=0;
    Node head;
    Node tail;
    public MyCircularQueue(int k) {
         head=null;
         tail=null;
        max=k;
    }
    
    public boolean enQueue(int value) {
        if(count==max){
            return false;
        }
        count++;
        Node newnode=new Node(value,null);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }else{
            tail.next=newnode;
            tail=tail.next;
            tail.next=head;
        }
        
        return true;
    }
    
    public boolean deQueue() {
        if(head==null){
            return false;
        }
        count--;
        if(head==tail){
            head=null;
            tail=null;
            return true;
        }else{
            head=head.next;
            tail.next=head;
            return true;
        }
    }
    
    public int Front() {
       if(head==null){  
        return -1;
       }else{
        return head.val;
       }
    }
    
    public int Rear() {
        if(tail==null){
            return -1;
        }else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(count==max){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */