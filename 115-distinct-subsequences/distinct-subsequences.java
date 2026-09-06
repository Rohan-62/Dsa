class Solution {
    private int subseq(String s,String t,int idx1,int idx2,int dp[][]){
      if(idx2==t.length()){
        return 1;
      }
       if(idx1==s.length()){
        return 0;
       }
       if(dp[idx1][idx2]!=-1){
        return dp[idx1][idx2];
       }
       int ans=0;
       if(s.charAt(idx1)==t.charAt(idx2)){
            int take=subseq(s,t,idx1+1,idx2+1,dp);
            int skip=subseq(s,t,idx1+1,idx2,dp);
            ans=take+skip;
        }
        else{
            ans=subseq(s,t,idx1+1,idx2,dp);
        }
        return dp[idx1][idx2]=ans;
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return subseq(s,t,0,0,dp);
        
    }
}