class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
                }
            else{
                return a[0]-b[0];
                }
        });
        int count=0;
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> li=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }else{
                li.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
           
        }
        li.add(new int[]{start,end});

        int [][]arr=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            arr[i][0]=li.get(i)[0];
            arr[i][1]=li.get(i)[1];
        }
        return arr;
    }
}