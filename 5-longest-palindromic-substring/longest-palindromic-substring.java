class Solution {
    public String longestPalindrome(String s) {
        int max=1,left,right,st=0,currentlen;
        for(int i=0;i<s.length();i++){
            left=i;
            right=i;
            while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
                currentlen=right-left+1;
                if(currentlen>max){
                    max=currentlen;
                    st=left;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() &&(s.charAt(left)==s.charAt(right))){
                currentlen=right-left+1;
                if(currentlen>max){
                    max=currentlen;
                    st=left;
                }
                left--;
                right++;
            }
           
        }
         return s.substring(st,st+max);
    }
}