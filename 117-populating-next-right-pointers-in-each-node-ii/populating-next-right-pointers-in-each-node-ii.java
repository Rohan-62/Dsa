/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class qval{
    Node node;
    int level;
    qval(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<qval> q=new LinkedList<>();
        q.offer(new qval(root,1));
        while(!q.isEmpty()){
            qval currqval=q.poll();
            Node currnode=currqval.node;
            int currlevel=currqval.level;
            if(currnode.left!=null){
                q.offer(new qval(currnode.left,currlevel+1));
            }
            if(currnode.right!=null){
                q.offer(new qval(currnode.right,currlevel+1));
            }
            if(q.isEmpty()||currlevel!=q.peek().level){
                currnode.next=null;
            }else{
                
                currnode.next=q.peek().node;
            }
        }
        return root;
    }
}