class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])==2){
                    return false;
                }else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }else{
                map.put(nums[i],1);
            }
        }
        return true;
    }
}