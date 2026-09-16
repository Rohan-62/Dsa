class Solution {
    public int addDigits(int num) {
        int curr=num;
        int sum=0;
        while(curr>=10){
            sum+=curr%10;
            curr=curr/10;
            if(curr<10){
                curr=sum+curr;
                sum=0;
            }
        }
        return curr;
    }
}