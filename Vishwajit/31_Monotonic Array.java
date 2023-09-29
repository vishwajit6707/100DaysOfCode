// Monotonic Array
// https://leetcode.com/problems/monotonic-array

class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 3) return true;
        int flag = 0;
        for(int i = 1; i<nums.length; i++){
            if(flag == 0){
                if(nums[i] - nums[i-1] > 0){
                    flag = 1;
                }
                if(nums[i] - nums[i-1] < 0){
                    flag = -1;
                }
            }
            if(flag == 1){
                if(nums[i] - nums[i-1] < 0) return false;
            }
            if(flag == -1){
                if(nums[i] - nums[i-1] > 0) return false;
            }
        }
        return true;
    }
}
