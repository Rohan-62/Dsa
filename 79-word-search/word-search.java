class Solution {
    public boolean dfs (char[][]board,int i,int j,String word,int idx,boolean[][]check){
        if(idx>=word.length()){
            return true;
        }
        if(i>=board.length ||i<0 ||j>=board[0].length||j<0){
            return false;
        }
        if(word.charAt(idx)!=board[i][j]){
            return false;
        }
        if(check[i][j]==true){
            return false;
        }
            check[i][j]=true;
            boolean top=dfs(board,i-1,j,word,idx+1,check);
            boolean bottom=dfs(board,i+1,j,word,idx+1,check);
            boolean left=dfs(board,i,j-1,word,idx+1,check);
            boolean right=dfs(board,i,j+1,word,idx+1,check);
            check[i][j]=false;
            return top||bottom||left||right;
        

    }
    public boolean exist(char[][] board, String word) {
        boolean check[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean res=dfs(board,i,j,word,0,check);
                    if(res==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}