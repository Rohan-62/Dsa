class Solution {
    public boolean isSubsequence(String s, String t) {
        int start=0;
        int i=0;
        int j=0;
        for(i=0;i<s.length();i++){
            for(j=start;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    start=j+1;
                    break;
                }
            }
            if(j>=t.length()){
                return false;
            }
        }
        return true;
    }
}