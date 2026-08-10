class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=s.length();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count--;
            }else{
                set.add(s.charAt(i));
            }
        }
        return count;
    }
}