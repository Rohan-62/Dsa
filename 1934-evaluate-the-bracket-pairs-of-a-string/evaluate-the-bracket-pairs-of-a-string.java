class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        boolean bracket=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                bracket=true;
                continue;
            }else if(ch==')'){
                String str=temp.toString();
                if(map.containsKey(str)){
                    sb.append(map.get(str));

                }else{
                    sb.append('?');
                }
                temp.setLength(0);
                bracket=false;
                continue;
            }

            if(!bracket){
                sb.append(ch);
            }else{
                temp.append(ch);
            }
        }
        return sb.toString();
    }
}