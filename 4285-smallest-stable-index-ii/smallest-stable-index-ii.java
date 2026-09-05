class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int[]rightmin=new int[n];
        for(int i=n-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            rightmin[i]=min;

        }
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(max-rightmin[i]<=k){
                return i;
            }

        }
        return -1;
    }
}