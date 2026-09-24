class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(nums[i]<10){
                if(nums[i]==i){
                    return i;
                }else{
                    continue;
                }
            }else if(nums[i]<100){
                sum+=nums[i]%10;
                sum+=(nums[i]%100)/10;
                if(sum==i){
                    return i;
                }else{
                    continue;
                }
            }else if(nums[i]<1000){
                sum+=nums[i]%10;
                sum+=(nums[i]%100)/10;
                sum+=(nums[i]%1000)/100;
                if(sum==i){
                    return i;

                }else{
                    continue;
                }
            }else if(nums[i]==1000 && i==1){
                return i;
            }
        }
        return -1;
    }
}