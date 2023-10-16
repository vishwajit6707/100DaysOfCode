// Pascal's Triangle II
// https://leetcode.com/problems/pascals-triangle-ii/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        for(int i = 1;i<=rowIndex+1; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j<i; j++){
                if(j == 0 || j == i -1) temp.add(1);
                else{
                    temp.add(lst.get(j-1) + lst.get(j));
                }
            }
            lst = temp;
        }
        return lst;
    }
}
