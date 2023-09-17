// Climbing Stairs.
// https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int dp[];
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return steps(n);
    }
    public int steps(int n){
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = steps(n - 1) + steps(n - 2);            
    }
}
