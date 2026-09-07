class Solution {
    int max;
    private int longestmaxseq(int[]nums,int idx,int prev,int [][]dp){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx][prev+1]!=-1){
            return dp[idx][prev+1];
        }
        int skip=longestmaxseq(nums,idx+1,prev,dp);
        int take=0;
        if(prev==-1||nums[idx]>nums[prev]){
            take=1+longestmaxseq(nums,idx+1,idx,dp);
        }
        return dp[idx][prev+1]=Math.max(skip,take);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return longestmaxseq(nums,0,-1,dp);
        
 
    
    }
}