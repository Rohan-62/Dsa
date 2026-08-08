class Solution {
    int option1=0;
    int option2=0;
    public int minPath(int grid[][],int i,int j,int [][]dp){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        return dp[i][j]= grid[i][j]+Math.min(minPath(grid,i+1,j,dp),minPath(grid,i,j+1,dp));   
        
    }
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return minPath(grid,0,0,dp);
    }
}