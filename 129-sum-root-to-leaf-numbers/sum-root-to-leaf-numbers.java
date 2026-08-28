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
class Solution {
    int sum=0;
    public void sumofleaf(TreeNode root,int val){
        if(root.left==null && root.right==null){
            val=(val*10)+root.val;
            sum+=val;
            return ;
        }
        if(root.left!=null){
            val=val*10;
            val+=root.val;
            sumofleaf(root.left,val);
            val/=10;

        }
        if(root.right!=null){
            val=val*10;
            val+=root.val;
            sumofleaf(root.right,val);
            val/=10;
        }
    }
    public int sumNumbers(TreeNode root) {
        sumofleaf(root,0);
        return sum;
    }
}