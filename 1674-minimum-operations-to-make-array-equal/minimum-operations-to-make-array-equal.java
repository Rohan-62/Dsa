class Solution {
    public int minOperations(int n) {
        int res=n-1;
        int temp=n-3;
        while(temp>0){
            res+=temp;
            temp-=2;
        }
        return res;
    }
}