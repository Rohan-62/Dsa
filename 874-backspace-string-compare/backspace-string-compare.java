class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> stt=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    continue;
                }
            }
        }
        for(char ch:t.toCharArray()){
           if(ch!='#'){
            stt.push(ch);
           }else{
            if(!stt.isEmpty()){
                stt.pop();
            }else{
                continue;
            }
           }
        }
        return st.equals(stt);
    }
}