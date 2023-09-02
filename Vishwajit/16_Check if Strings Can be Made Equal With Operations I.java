// Check if Strings Can be Made Equal With Operations I
// https://leetcode.com/contest/biweekly-contest-112/problems/check-if-strings-can-be-made-equal-with-operations-i/

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] ch = new char[4];
        for(int i = 0; i<s1.length(); i++){
            ch[i] = s1.charAt(i);
        }
        int flag = 0;
        for(int i = 0; i<s2.length(); i++){
            if(i == 0 || i == 2){
                if(ch[0] == s2.charAt(i)){
                    ch[0] = '_';
                }
                else if(ch[2] == s2.charAt(i)){
                    ch[2] = '_';
                }else{
                    return false;
                }
            }
            else{
                if(ch[1] == s2.charAt(i)){
                    ch[1] = '_';
                }
                else if(ch[3] == s2.charAt(i)){
                    ch[3] = '_';
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
