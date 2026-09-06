class Solution {
    private boolean interleavestr(String s1,String s2,String s3,int idx1,int idx2,Boolean dp[][]){
        if(idx1==s1.length() && idx2==s2.length()){
            return true;
        }
        if(dp[idx1][idx2] != null){
            return dp[idx1][idx2];
        }
        int idx3=idx1+idx2;
        
        boolean ans1=false;
        boolean ans2=false;
        if(idx1<s1.length() &&s1.charAt(idx1)==s3.charAt(idx3)){
           ans1=interleavestr(s1,s2,s3,idx1+1,idx2,dp);
        }
        if(idx2<s2.length() && s2.charAt(idx2)==s3.charAt(idx3)){
           ans2=interleavestr(s1,s2,s3,idx1,idx2+1,dp);
        }
        return dp[idx1][idx2]=ans1||ans2;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        Boolean dp[][]=new Boolean[s1.length()+1][s2.length()+1];
       return interleavestr(s1,s2,s3,0,0,dp);
        
    }
}