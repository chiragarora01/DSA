// Last updated: 13/8/2026, 11:49:57 pm
class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int maximum = 0;

        for(int i=0;i<nums.length;i++){
            maximum = Math.max(maximum+nums[i], nums[i]);
            res = Math.max(res,maximum);
        }
        return res;
    }
}