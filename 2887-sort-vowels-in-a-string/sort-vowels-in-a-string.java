class Solution {
    public String sortVowels(String s) {
        List<Character> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                li.add(ch);
            }
        }
        Collections.sort(li);
        int idx=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sb.append(li.get(idx++));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}