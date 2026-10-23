class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }
        ArrayList <Integer>li=new ArrayList<>();
        for(int n:nums2){
            if(map.containsKey(n) && map.get(n)>0){
                li.add(n);
                map.put(n,map.get(n)-1);
            }
        }

        int idx=0;
        int[] arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[idx++]=li.get(i);
        }
        return arr;
    }
}