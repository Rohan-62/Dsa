class Solution {
    public int smallestNumber(int n, int t) {
        while(n>0){
            int num=n;
            int prod=1;
            while(num>0){
                prod*=num%10;
                num/=10;
            }
            if(prod%t==0){
                return n;
            }
            n++;
        }
        return 0;
    }
}