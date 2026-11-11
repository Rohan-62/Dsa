class Solution {
    public long minimumCost(int cost1, int cost2, int costboth, int need1, int need2) {
        long option1=(long)cost1*need1+(long)cost2*need2;
        long option2=(long)Math.min(need1,need2)*costboth+(long)Math.max(0,need1-need2)*Math.min(cost1,costboth)+(long)Math.max(0,need2-need1)*Math.min(cost2,costboth);
        long option3=(long)Math.max(need1,need2)*costboth;
        return Math.min(option1,Math.min(option2,option3));
    }
}