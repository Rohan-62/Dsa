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
        }
        int num=min+1;
        while(num!=max){
            boolean isfound=false;
            for(int i=0;i<nums.length;i++){
                if(num==nums[i]){
                    isfound=true;
                    break;
                }
            }
            if(!isfound){
                res.add(num);
            }
            num++;
        }
        return res;
    }
}