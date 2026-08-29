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
    List<List<Integer>> res=new ArrayList<>();
    public void traverse(TreeNode root,List<Integer>li,int sum,int target){
        if(root.left==null && root.right==null){
            if(sum+root.val==target){
                li.add(root.val);
                res.add(new ArrayList(li));
                li.remove(li.size()-1);
                return;
            }else{
                return ;
            }
        }
        if(root.left!=null){
            li.add(root.val);
            traverse(root.left,li,sum+root.val,target);
            li.remove(li.size()-1);
        }
        if(root.right!=null){
            li.add(root.val);
            traverse(root.right,li,sum+root.val,target);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>li=new ArrayList<>();
        if(root==null)return res;
        traverse(root,li,0,targetSum);
        return res;
    }
}