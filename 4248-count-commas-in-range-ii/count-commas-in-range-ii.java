class Solution {
    public long countCommas(long n) {
         long res = 0;
        long beg = 1000;
        while(beg<= n) {
            res += n - beg + 1;
            beg *= 1000;
        }

        return res;
    }
}