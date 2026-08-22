// Last updated: 22/8/2026, 9:49:15 pm
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int i=0,j=0;

        while(j<nums.length){
            int temp = nums[j];
            while(j<nums.length && temp==nums[j])
                j++;
            nums[i++]=temp;
        }
        return i;
    }
}