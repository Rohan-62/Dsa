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
    boolean res=false;
    private void sumofnodes(TreeNode tptr,int target,int sum){
        if(tptr==null){
            return;
        }
        sum+=tptr.val;
        if(tptr.left==null && tptr.right==null){
            if(sum==target){
                res=true;
                return;
            }
        }
        sumofnodes(tptr.left,target,sum);
        sumofnodes(tptr.right,target,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        sumofnodes(root,targetSum,0);
        return res;
    }
}