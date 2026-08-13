// Last updated: 13/8/2026, 11:42:31 pm
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                res = Math.max(++count,res);
            else
                count=0;
        }
        return res;
    }
}