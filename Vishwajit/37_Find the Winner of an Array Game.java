// Find the Winner of an Array Game
// https://leetcode.com/problems/find-the-winner-of-an-array-game

class Solution {
    public int getWinner(int[] arr, int k) {
        int element = arr[0], wins = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > element){
                element = arr[i];
                wins = 0;
            }
            if(++wins == k) break;
        }   
        return element;
    }
}
