//  Minimum Deletions to Make Character Frequencies Unique.
// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Integer> freq = new HashSet<>();
        int del = 0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int x : map.values()){
            while(x > 0 && freq.contains(x)){
                x--;
                del++;
            }
            freq.add(x);
        }
        return del;
    }
}
