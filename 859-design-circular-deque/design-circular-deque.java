class Node{
    int val;
    Node next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}


class MyCircularDeque {
    int count=0;
    int max=0;
    Node head=null;
    Node tail=null;
    public MyCircularDeque(int k) {
        max=k;

    }
    
    public boolean insertFront(int value) {
        if(count==max){
            return false;
        }
        Node newnode=new Node(value,null);
        count++;
        if(head==null){
            head=newnode;
            tail=newnode;
            return true;
        }else{
            newnode.next=head;
            head=newnode;
            return true;
        }
    }
    
    public boolean insertLast(int value) {
        if(count==max){
            return false;
        }
        Node newnode=new Node(value,null);
        count++;
        if(head==null){
            head=newnode;
            tail=newnode;
            return true;
        }else{
            tail.next=newnode;
            tail=tail.next;
            tail.next=head;
            return true;
        }
    }
    
    public boolean deleteFront() {
        if(head==null){
            return false;
        }
        count--;
        if(head.next==head){
            head=null;
            tail=null;
        }else{
            head=head.next;
            tail.next=head;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(head==null){
            return false;
        }
        count--;
        if(head==tail){
            head=null;
            tail=null;
        
        }else{
            Node tptr=head;
            while(tptr.next!=tail){
                tptr=tptr.next;
            }
            tail=tptr;
            tail.next=head;
        }
        return true;
    }
    
    public int getFront() {
        if(head==null){
            return -1;
        }else{
            return head.val;
        }
    }
    
    public int getRear() {
        if(head==null){
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
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */