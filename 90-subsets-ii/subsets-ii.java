class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void dfs(int[] nums,int idx,List li){
        if(idx==nums.length){
            if(!res.contains(li)){
            res.add(new ArrayList(li));
            }
            return;
            
        }
        li.add(nums[idx]);
        dfs(nums,idx+1,li);
        li.remove(li.size()-1);
        dfs(nums,idx+1,li);

        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>li=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0,li);
           
        return res;
    
    }
}