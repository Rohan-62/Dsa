class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            pivot=i;
            break;

        }}
        if(pivot==-1){
            int start=0,end=nums.length-1;
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }else{
       
       for(int i=nums.length-1;i>pivot;i--){
        if(nums[pivot]<nums[i]){
            int temp=nums[pivot];
            nums[pivot]=nums[i];
            nums[i]=temp;
            int start=pivot+1,end=nums.length-1;
            while(start<end){
                 temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            break;
        }

       }
        }
       

        
    }
}