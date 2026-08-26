class Solution {
    ArrayList<String>res=new ArrayList<>();

    public void generatepara(int n,StringBuilder sb,int open,int close){
        if(open>n || close>n){
            return ;
        }
        if(close>open){
            return ;
        }
        
        if(open==n && close==n){
            res.add(sb.toString());
            return ;
        }
        
        if(open<n){
            sb.append("(");
            generatepara(n,sb,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<n){
            sb.append(")");
            generatepara(n,sb,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }



    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder("(");
        generatepara(n,sb,1,0);
      
        return res;
    }
}