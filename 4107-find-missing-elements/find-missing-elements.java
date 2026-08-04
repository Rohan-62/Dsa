class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=-1;
        int max=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(min==-1 || nums[i]<min){
                min=nums[i];
            }
            res.add(nums[i]);
        }
        int num=min;
        while(num<=max){
            if(res.isEmpty()){
                return res;
            }
            else if(res.contains(num)){
                res.remove(res.indexOf(num));
            }else{
                res.add(num);
            }
            num++;
        }
        return res;
    }
}