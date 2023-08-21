https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums.length ; i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.get(nums[i]) + 1);
            }
            else{
                hs.put(nums[i],1);
            }
        }
        for(int x : hs.keySet()){
            if(hs.get(x) > 1){
                ans.add(x);
            }
        }
        return ans;

    }
}
