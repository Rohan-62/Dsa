class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(sb.length()>0){
                    st.push(sb.toString());
                    sb.setLength(0);
                }else{
                    continue;
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()>0){
            st.push(sb.toString());
        }
        sb.setLength(0);
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}