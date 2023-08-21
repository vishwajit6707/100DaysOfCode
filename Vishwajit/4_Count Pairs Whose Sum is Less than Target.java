// Count Pairs Whose Sum is Less than Target
// problem link - https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
// Approach - brute force approach.

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for(int i = 0; i<nums.size(); i++){
            for(int j = i + 1; j<nums.size() ; j++){
                if(nums.get(i) + nums.get(j) < target) ans++;
            }
        }
        return ans;
    }
}
