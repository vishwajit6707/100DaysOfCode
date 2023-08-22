// Problem link - https://leetcode.com/problems/excel-sheet-column-title/

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            st.append((char)((columnNumber) % 26 + 'A'));
            columnNumber = columnNumber/26;
        }
        return st.reverse().toString();
    }
}
