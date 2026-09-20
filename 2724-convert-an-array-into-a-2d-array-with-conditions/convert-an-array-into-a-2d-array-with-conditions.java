class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        HashSet<Integer> idx=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>row=new HashSet<>();
            List<Integer>li=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(!idx.contains(j)){
                    if(!row.contains(nums[j])){
                        li.add(nums[j]);
                        idx.add(j);
                        row.add(nums[j]);
                    }else{
                        continue;
                    }
                }
            }
            if(li.isEmpty()){
                break;
            }
            res.add(li);
        }
        return res;
    }
}