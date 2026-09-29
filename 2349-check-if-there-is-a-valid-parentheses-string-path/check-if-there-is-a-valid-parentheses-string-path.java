class Solution {
    public boolean validpath(char[][]grid,int balance,int i,int j,Boolean dp[][][]){
        if(balance<0){
            return false;
        }
        
        if(i==grid.length-1 && j==grid[0].length-1){
            if(grid[grid.length-1][grid[0].length-1]==')'){
                if(balance-1==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        if(i>=grid.length ||j>=grid[0].length){
            return false;
        }
        if(dp[i][j][balance]!=null){
            return dp[i][j][balance];
        }

        if(grid[i][j]=='('){
            return dp[i][j][balance]=validpath(grid,balance+1,i+1,j,dp)||validpath(grid,balance+1,i,j+1,dp);
        }else{
            return dp[i][j][balance]=validpath(grid,balance-1,i+1,j,dp)||validpath(grid,balance-1,i,j+1,dp);
        }
        
    }
    
    public boolean hasValidPath(char[][] grid) {
        Boolean dp[][][]=new Boolean[grid.length][grid[0].length][grid.length+grid[0].length];
        if(grid[0][0]==')'){
            return false;
        }else{
            return validpath(grid,1,1,0,dp)||validpath(grid,1,0,1,dp);
        }
    }
}