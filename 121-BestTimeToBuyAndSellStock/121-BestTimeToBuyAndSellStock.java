// Last updated: 13/8/2026, 11:27:28 pm
class Solution {
    public int maxProfit(int[] prices) {
       if(prices.length<=1) return 0;
       int res=0;
       int cheap =prices[0];
       for(int i=1;i<prices.length;i++){
        res = Math.max(res,prices[i]-cheap);
        cheap = Math.min(cheap,prices[i]);
       }
        return res;
    }
}