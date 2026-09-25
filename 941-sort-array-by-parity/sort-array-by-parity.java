class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[left]%2==0){
                left++;
                right++;
            }
            else{
                if(nums[right]%2==1){
                    right++;
                }else{
                    int temp=nums[left];
                    nums[left]=nums[right];
                    nums[right]=temp;
                    left++;
                    right=left;
                }
            }
        }
        return nums;
    }
}