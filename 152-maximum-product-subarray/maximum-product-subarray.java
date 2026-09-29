class Solution {
    public int maxProduct(int[] nums) {
        int prod=1;
        int max=0;
        if(nums.length==1){
            return nums[0];
        }
        
        for(int i=0;i<nums.length;i++){
            int right=i;
            prod=1;
            while(right<nums.length){
                if(prod==0){
                    break;
                }else{
                    prod*=nums[right];
                    right++;
                }
                if(prod>max){
                    max=prod;

                }
            }
        }
        return max;
    }
}