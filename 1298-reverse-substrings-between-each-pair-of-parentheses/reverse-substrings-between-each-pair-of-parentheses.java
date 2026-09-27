class Solution {
    public String reverseParentheses(String s) {
        Stack <Character> st=new Stack<>();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            char ch=s.charAt(i++);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                int j=0;
                st.pop();
                while(j<sb.length()){
                    st.push(sb.charAt(j++));
                }
                sb.setLength(0);
                
            }else{
                st.push(ch);
            }
            
        }
        StringBuilder res=new StringBuilder();
       while(!st.isEmpty()){
        char ch=st.pop();

                res.append(ch);
            
       }
       return res.reverse().toString();
    }
}