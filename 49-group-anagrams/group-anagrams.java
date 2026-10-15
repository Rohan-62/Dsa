class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList> map=new HashMap<>();
       for(int i=0;i<strs.length;i++){
        char str[]=strs[i].toCharArray();
        Arrays.sort(str);
        String key=String.valueOf(str);
        if(map.containsKey(key)){
            map.get(key).add(strs[i]);
        }else{
            map.put(key,new ArrayList());
            map.get(key).add(strs[i]);
        }
       }
       return new ArrayList(map.values());
    }
}