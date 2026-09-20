class Solution {
    public boolean dfs (char[][]board,int i,int j,String word,StringBuilder sb,boolean[][]check){
        if(sb.length()==word.length()){
            String str=sb.toString();
           
            if(str.equals(word)){
                System.out.println(str);
                return true;
            }else{
                return false;
            }
        }   
        
        if(i>=board.length ||i<0 ||j>=board[0].length||j<0){
            return false;
        }
          
        
        int len=sb.length();
        boolean top=false;
        boolean bottom=false;
        boolean left=false;
        boolean right=false;
         if(check[i][j]==false){
                     sb.append(board[i][j]);
                     check[i][j]=true;
                    top=dfs(board,i-1,j,word,sb,check);
                    bottom=dfs(board,i+1,j,word,sb,check);
                    left=dfs(board,i,j-1,word,sb,check);
                    right=dfs(board,i,j+1,word,sb,check);
                    check[i][j]=false;
                    sb.setLength(len);
                }
        
              
                return top||bottom||left||right;
        

    }
    public boolean exist(char[][] board, String word) {
        StringBuilder sb=new StringBuilder();
        boolean check[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean res=dfs(board,i,j,word,sb,check);
                    if(res==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}