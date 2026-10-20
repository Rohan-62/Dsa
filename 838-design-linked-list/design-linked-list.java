class Node{
    int val;
    Node next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}


class MyLinkedList {
    Node head;
    Node tail;
    int count=0;
    public MyLinkedList() {
        head=null;
        tail=null;        
    }
    
    public int get(int index) {
        if(head==null){
            return -1;
        }
        if(index==0){
            return head.val;
        }
        if(index>=count){
            return -1;
        }
        int curr=0;
        Node tptr=head;
        while(tptr!=null && curr!=index){
            curr++;
            tptr=tptr.next;
        }
        if(tptr==null){
            return -1;
        }else{
            return tptr.val;
        }
        

    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val,null);
        count++;
        if(head==null){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    
    }
    
    public void addAtTail(int val) {
        count++;
        Node newnode=new Node(val,null);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(count<index){
            return;
        }
        Node newnode=new Node(val,null);
        
        if(index==0){
            if(head==null){
                head=newnode;
                tail=newnode;

            }else{
                newnode.next=head;
                head=newnode;
            }
        }else if(index==count){
            tail.next=newnode;
            tail=newnode;
        }else{
            int curr=0;
            Node tptr=head;
            while(tptr!=null && curr!=index-1){
                curr++;
                tptr=tptr.next;
            }
            if(tptr==null){
                return;
            }
            newnode.next=tptr.next;
            tptr.next=newnode;

        }
        count++;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        if(index>=count){
            return;
        }
        if(index==0){
            if(head==tail){
                tail=null;
            }
            head=head.next;
        }else if(index+1==count){
            Node tptr=head;
            while(tptr!=null && tptr.next!=tail){
                tptr=tptr.next;

            }
            if(tptr==null){
                return ;
            }
            tptr.next=null;
            tail=tptr;
        }else{
            int curr=0;
            Node tptr=head;
            while(tptr.next!=null && curr!=index-1){
                curr++;
                tptr=tptr.next;
            }
            Node temp=tptr.next;
            tptr.next=temp.next;
        }
        
        count--;

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