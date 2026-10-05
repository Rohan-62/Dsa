class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int sum=0;
        int tot=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
            }else{
                while(st.peek()!='('){
                    sum+=(st.pop()-'0');
                }
                st.pop();
                if(sum==0){
                    st.push('1');
                    
                }
                else{
                    tot=sum*2;
                    char ch1=(char)(tot+'0');
                    st.push(ch1);
                    sum=0;
                }
               
                
               
            }
        }
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop()-'0';
        }
        return res;

    }
}