class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                     map.put(nums[i],map.get(nums[i])+1);
                 }else{
                    map.put(nums[i],1);
                    }
            }
        }
        int max=0;
        int res=-1;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])>max){
                max=map.get(nums[i]);
                res=nums[i];
            }
        }
        return res;
    }
}