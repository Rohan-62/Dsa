class Solution {
    public int climb(int n,int []costs,int idx,int[]dp){
        
        if(idx==n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int cost1=Integer.MAX_VALUE;
        int cost2=Integer.MAX_VALUE;
        int cost3=Integer.MAX_VALUE;
        if(idx+1<=n){
            cost1=costs[idx]+1+climb(n,costs,idx+1,dp);
        }
         if(idx+2<=n){
            cost2=costs[idx+1]+4+climb(n,costs,idx+2,dp);
        }
         if(idx+3<=n){
            cost3=costs[idx+2]+9+climb(n,costs,idx+3,dp);
        }
        return dp[idx]=Math.min(cost1,Math.min(cost2,cost3));
    }
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,costs,0,dp);
    }
}