// Minimum Operations to Reduce X to Zero.
// https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/

class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }   
        int max = -1;
        int cSum = 0;
        int l = 0;
        for(int i = 0; i<nums.length; i++){
            cSum += nums[i];
            while(l <= i && cSum > sum - x) cSum -= nums[l++];
            if(cSum == sum - x) max = Math.max(max, i - l + 1);
        }
        return max == -1 ? -1 : nums.length - max;
    }
}
