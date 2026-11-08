class Solution {
    public int countServers(int[][] grid) {
        int servercount=0;
        int []row=new int[grid.length];
        int []col=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    servercount++;
                    row[i]+=1;
                    col[j]+=1;
                }
                
            }
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && row[i]==1 && col[j]==1){
                    count++;
                }
            }
        }
        return servercount-count;
    }
}