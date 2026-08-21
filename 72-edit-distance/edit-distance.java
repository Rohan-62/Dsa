class Solution {
    public int findmin(String word1,String word2,int idx1,int idx2,int [][]dp){
        if(idx1>=word1.length()){
            return word2.length()-idx2;
        }
        if(idx2>=word2.length() ){
            return word1.length()-idx1;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        
        if(word1.charAt(idx1)==word2.charAt(idx2)){
            return 0+findmin(word1,word2,idx1+1,idx2+1,dp);
        }else{
            return dp[idx1][idx2]= 1+Math.min(findmin(word1,word2,idx1,idx2+1,dp),Math.min(findmin(word1,word2,idx1+1,idx2,dp),findmin(word1,word2,idx1+1,idx2+1,dp)));
        }
       

    }
    public int minDistance(String word1, String word2) {
    int[][] dp=new int[word1.length()][word2.length()];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return findmin(word1,word2,0,0,dp);
    }
}