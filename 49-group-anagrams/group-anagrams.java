class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
        
            }else{
                map.put(sorted,new ArrayList());
                map.get(sorted).add(strs[i]);
              
            }
            
        }
        for(String str:map.keySet()){
                res.add(new ArrayList(map.get(str)));
            }
        return res;
    }
}