// Last updated: 15/8/2026, 2:25:03 pm
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=Arrays.stream(nums).sum();

        for(int i=0;i<nums.length;i++){
            if(leftSum==rightSum-nums[i]) return i;
            leftSum+=nums[i];
            rightSum-=nums[i];
        }
        return -1;
    }
}