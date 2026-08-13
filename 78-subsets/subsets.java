class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void dfs(int[]nums,int idx,ArrayList list){
        if(idx==nums.length){
            res.add(new ArrayList(list));
            return ;
        }
        dfs(nums,idx+1,list);
        list.add(nums[idx]);
        dfs(nums,idx+1,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        dfs(nums,0,li);
        return res;
    }
}