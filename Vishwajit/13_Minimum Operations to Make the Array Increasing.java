// Minimum Operations to Make the Array Increasing.
// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing

class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        for(int i = 1;i < nums.length; i++){
            if(nums[i]<=nums[i-1]){
                operations += (nums[i-1]+1) - nums[i];
                nums[i] = nums[i-1]+1;
            }
        }
        return operations;
    }
}
