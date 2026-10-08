class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch=='('){
                sb.append(ch);
                st.push(ch);
            }else{
                if(st.size()!=1){
                    sb.append(ch);
                    st.pop();
                }else{
                    st.pop();
                }
            }
        }
        return sb.toString();
    }
}