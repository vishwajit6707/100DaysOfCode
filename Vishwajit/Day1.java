
// approach - using hash table.
// we can use hashmap to store the values with index and while every iteration we can check if the target minus value is available
// in the hash table or not.


// time complextiy - O(N).
// space complexity - O(N).

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            if(hs.containsKey(target - nums[i])){
                return new int[]{i,hs.get(target - nums[i])};
            }else{
                hs.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
