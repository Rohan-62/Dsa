/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Qval{
    TreeNode node;
    int level;
    Qval(){
        node=null;
        level=0;
    }
    Qval(TreeNode newNode,int lev){
        node=newNode;
        level=lev;
    }
 }
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer>li=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<Qval>q=new LinkedList<>();
        Stack<Qval>st=new Stack<>();
        if(root==null){
            return res;
        }
        q.offer(new Qval(root,1));
        while(!q.isEmpty()){
            Qval curr=q.poll();
            st.push(curr);
            TreeNode currnode=curr.node;
            if(currnode.left!=null){
                q.offer(new Qval(currnode.left,curr.level+1));
            }
            if(currnode.right!=null){
                q.offer(new Qval(currnode.right,curr.level+1));
            }
           
        }
        
        int prevval=1;
        if(!st.isEmpty()){
         prevval=st.peek().level;
        }
        while(!st.isEmpty()){
            Qval currnode=st.pop();
            if(prevval!=currnode.level){
                res.add(new ArrayList(li));
                li.clear();
                li.add(currnode.node.val);
                prevval=currnode.level;
            }else{
                li.add(0,currnode.node.val);
            }


        }
        res.add(li);
        return res;
        
    }
}