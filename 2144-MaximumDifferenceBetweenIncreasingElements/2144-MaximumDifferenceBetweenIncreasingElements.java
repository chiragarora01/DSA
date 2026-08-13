// Last updated: 13/8/2026, 11:23:04 pm
class Solution {
    public int maximumDifference(int[] nums) {
        int res = -1;
        if (nums.length <= 1) return res;
        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > small) {
                res = Math.max(res, nums[i] - small);
            }
            small = Math.min(small, nums[i]);
        }
        return res;
    }
}