class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]arr=new int[2];
        for(int i=0;i<=nums.length-1;i++){
            int val=target-nums[i];
            if(map.containsKey(nums[i])){
                arr[0]=map.get(nums[i]);
                arr[1]=i;
            }else{
                map.put(val,i);
            }

        }
         return arr;
    }
   
}