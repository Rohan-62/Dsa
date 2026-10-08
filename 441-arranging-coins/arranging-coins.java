class Solution {
    public int arrangeCoins(int n) {
       int stair=1;
       int count=0;
       while(n>0){
        n-=stair;
        stair++;
        count++;
       } 
       if(n==0){
        return count;
       }else{
        return count-1;
       }
    }
}