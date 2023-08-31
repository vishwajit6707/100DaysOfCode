// Minimum Cuts to Divide a Circle.
// Problem link - https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/


// Approach -
// if we the value is off we will return the same number and if the value is even we will return the half of it.
// and for the 1 we will return 0.
// Time complexity - O(1).
// Space complexity - O(1).

class Solution {
    public int numberOfCuts(int n) {
        if(n == 1) return 0;
        if(n % 2 == 1) return n;
        return n/2;
    }
}
