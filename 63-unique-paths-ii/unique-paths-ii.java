class Solution {
    public int uniquepath(int[][]obstacle,int row,int col,int totrow,int totcol,int [][]dp){
        if(row>=totrow || col>=totcol){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        if(row==totrow-1 && col==totcol-1){
            if(obstacle[row][col]==1) return 0;
            else return 1;
        }
        if(obstacle[row][col]==1){
            return 0;
        }
        
        return dp[row][col]=uniquepath(obstacle,row+1,col,totrow,totcol,dp)+uniquepath(obstacle,row,col+1,totrow,totcol,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return uniquepath(obstacleGrid,0,0,obstacleGrid.length,obstacleGrid[0].length,dp);
    }
}