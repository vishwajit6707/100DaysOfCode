// https://leetcode.com/problems/check-if-array-is-good

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        HashSet<Integer> hs = new HashSet<>();
        boolean last_num = false;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > n || nums[i] <= 0) return false;
            if(nums[i] == n && hs.contains(n)){
                if(last_num) return false;
                last_num = true;
            }
            else if(nums[i] == n){
                hs.add(n);
            }
            else{
                if(hs.contains(nums[i])) return false;
                hs.add(nums[i]);
            }
        }
        return true;
    }
}
