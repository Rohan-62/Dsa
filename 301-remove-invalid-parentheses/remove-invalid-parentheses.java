class Solution {
    List<String> res=new ArrayList<>();
    public void remove(String s,int idx, int leftremove ,int rightremove,int open,StringBuilder sb){
    
        if(idx==s.length()){
            if(leftremove==0 && rightremove==0 && open==0 && !res.contains(sb.toString())){
                res.add(sb.toString());
            }
            return;
        }

        int len=sb.length();
        char ch=s.charAt(idx);
        if(ch=='(' && leftremove>0){
            remove(s,idx+1,leftremove-1,rightremove,open,sb);
        }else if(ch==')' && rightremove>0){
            remove(s,idx+1,leftremove,rightremove-1,open,sb);
        }
        sb.append(ch);
        if(ch=='('){
            remove(s,idx+1,leftremove,rightremove,open+1,sb);
        }else if(ch==')'){
            if(open>0){
                remove(s,idx+1,leftremove,rightremove,open-1,sb);
            }
            
        }else{
            remove(s,idx+1,leftremove,rightremove,open,sb);
        }
        sb.setLength(len);
    }
    public List<String> removeInvalidParentheses(String s) {
        
        int leftremove=0;
        int rightremove=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                leftremove++;
            }else if(ch==')'){
                if(leftremove>0){
                    leftremove--;
                }else{
                    rightremove++;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        remove(s,0,leftremove,rightremove,0,sb);
    
        
        
        
       
    return res;
    }
}