class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void dfs(int []nums,int idx,int sum,int target,ArrayList li){
        if(sum>target){
            return ;
        }if(sum==target && !res.contains(li)){
            res.add(new ArrayList(li));
        }
        if(idx==nums.length){
            return;
        }
        dfs(nums,idx+1,sum,target,li);
        li.add(nums[idx]);
        dfs(nums,idx,sum+nums[idx],target,li);
       // dfs(nums,idx+1,sum+nums[idx],target,li);
        li.remove(li.size()-1);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer>li=new ArrayList<>();
        dfs(nums,0,0,target,li);
      return res;

       
    }
}