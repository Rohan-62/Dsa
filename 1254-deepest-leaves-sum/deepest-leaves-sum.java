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
    int maxheight=0;
    int sum=0;
    public void leavessum(TreeNode root,int height){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            if(height>maxheight){
                maxheight=height;
                sum=root.val;
            }else if(height==maxheight){
                sum+=root.val;
            }else{
                return;
            }
        }
        
        if(root.left!=null){
            leavessum(root.left,height+1);
        }
        if(root.right!=null){
            leavessum(root.right,height+1);
        }
    }
    
    public int deepestLeavesSum(TreeNode root) {
        leavessum(root,1);
        return sum;
    }
}