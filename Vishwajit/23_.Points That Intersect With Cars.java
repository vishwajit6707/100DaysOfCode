// Points That Intersect With Cars.
// https://leetcode.com/problems/points-that-intersect-with-cars/

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<nums.size(); i++){
            for(int j = nums.get(i).get(0); j<=nums.get(i).get(1); j++){
                hs.add(j);
            }
        }
        return hs.size();
    }
}
