class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       HashSet<Integer> set2=new HashSet<>();
       for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
       }
       int count=0;
       for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]) && !set2.contains(nums2[i])){
                count++;
                set2.add(nums2[i]);
            }
       }
       int[]arr=new int[count];
       int idx=0;
       set2.clear();
       for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]) && !set2.contains(nums2[i])){
                arr[idx++]=nums2[i];
                set2.add(nums2[i]);
            }
       }
       
        return arr;
    }
}