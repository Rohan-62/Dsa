class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total=nums1.length+nums2.length;
        int []arr=new int[total];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int k=nums1.length;
        for(int i=0;i<nums2.length;i++){
            arr[k]=nums2[i];
            k++;
        }
        Arrays.sort(arr);
        int high=arr.length,low=0;
        if((arr.length)%2!=0){
            int mid=arr[low+(high-low)/2];
            return mid;
        }else{
            int mid=low+(high-low)/2;
            double avg=(arr[mid]+arr[mid-1])/2.0;
            return avg;
            
        }

    }
}