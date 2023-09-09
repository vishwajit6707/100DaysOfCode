// Combination Sum IV.
// https://leetcode.com/problems/combination-sum-iv/

class Solution {
    int dp[];
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        return helper(target,nums);
    }
    public int helper(int target,int nums[]){
        if(dp[target] != -1) return dp[target];
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(target >= nums[i]) res += helper(target - nums[i],nums);
        }
        return dp[target] = res;
    }
}
