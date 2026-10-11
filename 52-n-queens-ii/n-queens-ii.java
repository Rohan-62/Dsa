class Solution {
    int res=0;
    public boolean isvalid(int n,int[][] grid,int row,int col){
        for(int i=0;i<row;i++){
            if(grid[i][col]==1){
                return false;
            }
        }
            int r=row-1;
            int c=col-1;
            while(r>=0 && c>=0){
                if(grid[r][c]==1){
                    return false;
                }
                r--;
                c--;
            }
            r=row-1;
            c=col+1;
            while(r>=0 && c<n){
                if(grid[r][c]==1){
                    return false;
                }
                c++;
                r--;
            }
        return true;
    }
    public void nqueens(int n,int[][]grid,HashSet set,int row){
        if(row==n){
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(!set.contains(i) && isvalid(n,grid,row,i)){
                set.add(i);
                grid[row][i]=1;
                nqueens(n,grid,set,row+1);
                grid[row][i]=0;
                set.remove(i);
            }
        }

    }
    public int totalNQueens(int n) {
        int grid[][]=new int[n][n];
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(i);
            grid[0][i]=1;
            nqueens(n,grid,set,1);
            grid[0][i]=0;
            set.remove(i);
        }
        return res;
    }
}