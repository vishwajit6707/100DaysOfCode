// problem link - https://leetcode.com/problems/combination-sum/

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        helper(candidates,target,0,new ArrayList<Integer>());
        return ans;
    }
    public void helper(int[] candidates,int target,int j, ArrayList<Integer> al){
        if(target < 0) return;
        if(target == 0){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = j ; i< candidates.length ; i++){
            al.add(candidates[i]);
            helper(candidates, target - candidates[i],i, al);
            al.remove(al.size()-1);
        }
    }
}
