// Check if Strings Can be Made Equal With Operations II.
// https://leetcode.com/contest/biweekly-contest-112/problems/check-if-strings-can-be-made-equal-with-operations-ii/


class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            if(i%2 == 0) ch1[s1.charAt(i) - 'a']++;
            if(i%2 == 1) ch2[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i<s2.length(); i++){
            if(i%2 == 0) ch1[s2.charAt(i) - 'a']--;
            if(i%2 == 1) ch2[s2.charAt(i) - 'a']--;
        }        
        for(int i = 0; i<26; i++){
            if(ch1[i] != 0 || ch2[i] != 0) return false;
        }
        return true;
    }
}
