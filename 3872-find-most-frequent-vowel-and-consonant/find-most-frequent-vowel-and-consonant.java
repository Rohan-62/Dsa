class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxvowel=0;
        int maxcons=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(map.get(ch)>maxvowel){
                    maxvowel=map.get(ch);
                }
            }else {
                if(map.get(ch)>maxcons){
                    maxcons=map.get(ch);
                }
            }
        }
        return maxvowel+maxcons;
    }
}