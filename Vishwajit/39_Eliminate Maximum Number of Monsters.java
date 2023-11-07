// Eliminate Maximum Number of Monsters.
// https://leetcode.com/problems/eliminate-maximum-number-of-monsters/

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double arr[] = new double[dist.length];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (double)dist[i]/speed[i];
        }
        Arrays.sort(arr);
        int ans  = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= i) {
                break;
            }
            ans++;
        }
        return ans;
    }
}
