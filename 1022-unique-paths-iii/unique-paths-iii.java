class Solution {
    int path=0;
    int block=0;
    public void uniquepaths(int [][]grid,int i,int j,int count,boolean [][]check){
        if(i<0 ||i>=grid.length||j<0||j>=grid[0].length){
            return;
        }
        if(grid[i][j]==-1){
            return ;
        }
        if(check[i][j]==true){
            return;
        }
        if(grid[i][j]==2 && count==(grid.length*grid[0].length)-block-1){
            path++;
            return;

        }
        check[i][j]=true;
        uniquepaths(grid,i+1,j,count+1,check);
        uniquepaths(grid,i,j+1,count+1,check);
        uniquepaths(grid,i-1,j,count+1,check);
        uniquepaths(grid,i,j-1,count+1,check);
        check[i][j]=false;

    }
    public int uniquePathsIII(int[][] grid) {
        int idx1=0;
        int idx2=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==-1){
                    block++;
                }
                if(grid[i][j]==1){
                    idx1=i;
                    idx2=j;
                }

            }
        }
        boolean check[][]=new boolean[grid.length][grid[0].length];
        uniquepaths(grid,idx1,idx2,0,check);
        return path;
    }
}