class Solution {
    List<String> res = new ArrayList<>();

    public void dfs(TreeNode root, StringBuilder sb) {
        int len=sb.length();
        if(root.left==null && root.right==null){
            sb.append(root.val);
            res.add(sb.toString());
            sb.setLength(len);
            return;
        }
        sb.append(root.val+"->");
        if(root.left!=null ){
            dfs(root.left,sb);
            
        }
        if(root.right!=null){
            dfs(root.right,sb);
        }
        sb.setLength(len);
       
    }

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, new StringBuilder());
        return res;
    }
}