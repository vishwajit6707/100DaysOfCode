// Remove Trailing Zeros From a String
// problem link - https://leetcode.com/problems/remove-trailing-zeros-from-a-string/

class Solution {
    public String removeTrailingZeros(String num) {
        String st = "";
        int index = num.length();
        for(int i = num.length()-1; i>= 0; i--){
            if(num.charAt(i) - 48 != 0) break;
            index--;
        }
        return num.substring(0,index);
    }
}
