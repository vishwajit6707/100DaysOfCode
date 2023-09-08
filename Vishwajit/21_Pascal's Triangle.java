// Pascal's Triangle.
// https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for(int i = 1; i<=numRows ; i++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0 ; j<i ; j++){
                if(j == 0 || j == i-1) al.add(1);
                else{
                    al.add(pre.get(j) + pre.get(j-1));
                }
            }
            ans.add(al);
            pre = al;
        }
        return ans;
    }
}
