class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int halfidx=n/2;
        int steps=0;
        for(int i=0;i<nums.length;i++){
            if(i!=halfidx){
                steps+=Math.abs(nums[i]-nums[halfidx]);
            }
        }
        return steps;

    }
}