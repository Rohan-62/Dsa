class Solution {
    public boolean checkvalid(String s,int idx,int open,int close,Boolean dp[][]){
        if(open<close){
            return false;
        }
        if(idx==s.length()){
            if(open==close){
                return true;
            }else{
                return false;
            }
        }
        if(dp[idx][open-close]!=null){
            return dp[idx][open-close];
        }
        if(s.charAt(idx)=='('){
                return dp[idx][open-close]=checkvalid(s,idx+1,open+1,close,dp);
        }else if(s.charAt(idx)=='*'){
            return dp[idx][open-close]=checkvalid(s,idx+1,open,close,dp)||checkvalid(s,idx+1,open+1,close,dp)||checkvalid(s,idx+1,open,close+1,dp);
        }else{
            return dp[idx][open-close]=checkvalid(s,idx+1,open,close+1,dp);
        }
    }
    public boolean checkValidString(String s) {
        Boolean dp[][]=new Boolean [s.length()+1][s.length()+1];
        return checkvalid(s,0,0,0,dp);
    }
}