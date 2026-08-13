// Last updated: 13/8/2026, 10:54:29 pm
class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int x=nums[i];
                nums[i]=nums[temp];
                nums[temp++]=x;
            }
        }
    }

}