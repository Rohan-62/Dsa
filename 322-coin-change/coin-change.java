class Solution {
    public int coinChange(int[] coins, int amount) {
       int dp[][]=new int[coins.length][amount+1];

       for(int i=0;i<coins.length;i++){
            dp[i][0]=0;
       }
       for(int j=0;j<amount+1;j++)
       {
        if(j%coins[0]==0){
            dp[0][j]=j/coins[0];
        }else{
            dp[0][j]=amount+1;
        }
       }

       for(int i=1;i<coins.length;i++){
        for(int j=1;j<amount+1;j++){
            if(j<coins[i]){
                dp[i][j]=dp[i-1][j];
            }else{
                dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i]]);
            }
        }
       }
       if(dp[coins.length-1][amount]>amount){
        return -1;
       }else{
        return dp[coins.length-1][amount];
       }
    }
}