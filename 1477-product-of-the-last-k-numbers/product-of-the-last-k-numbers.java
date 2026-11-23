class Node{
    int val;
    Node next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}

class ProductOfNumbers {
    Node head;
    Node temp;
    public ProductOfNumbers() {
        head=null;
        temp=null;
    }
    
    public void add(int num) {
        Node newnode=new Node(num,null);
        newnode.next=head;
        head=newnode; 
    }
    
    public int getProduct(int k) {
        temp=head;
        int prod=1;
        for(int i=0;i<k;i++){
            prod*=temp.val;
            temp=temp.next;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */