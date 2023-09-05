// Count Symmetric Integers.
// https://leetcode.com/problems/count-symmetric-integers/

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans  = 0;
        for(int i = low; i<=high; i++){
            String st = Integer.toString(i);
            if(st.length()%2 == 1) continue;
            int cal = 0;
            for(int j = 0; j<st.length()/2 ; j++){
                cal += st.charAt(j) - st.charAt(st.length() - j - 1);
            }
            if(cal == 0) ans++;
        }
        return ans;
    }
}
