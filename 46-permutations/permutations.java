class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void dfs(int []nums,List li,HashSet set){
        if(set.size()==nums.length){
            res.add(new ArrayList(li));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                set.add(i);
                li.add(nums[i]);
                dfs(nums,li,set);
                set.remove(i);
                li.remove(li.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> li=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(i);
            li.add(nums[i]);
            dfs(nums,li,set);
            set.remove(i);
            li.remove(li.size()-1);
        }
        return res;
    }
}