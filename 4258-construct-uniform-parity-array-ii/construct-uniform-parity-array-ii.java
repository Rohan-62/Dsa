class Solution {
    public boolean uniformArray(int[] nums1) {
        HashSet<Integer>set=new HashSet<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min){
                min=nums1[i];
            }
        }
        if(min%2==0){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2==0){
                    set.add(nums1[i]);
                }else{
                    if((nums1[i]-min)%2==1){
                        return false;
                    }
                }
            }
        }else{
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2==1){
                    set.add(nums1[i]);
                }else{
                    if((nums1[i]-min)%2==0){
                        return false;
                    }
                }
            }
        }
        return true;

        
           
    }
}