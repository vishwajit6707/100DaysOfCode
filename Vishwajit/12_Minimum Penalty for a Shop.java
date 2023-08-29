// Minimum Penalty for a Shop.
// Problem link - https://leetcode.com/problems/minimum-penalty-for-a-shop/


class Solution {
    public int bestClosingTime(String customers) {
        int hour = customers.length()-1;
        int ct = 0;
        int arr[] = new int[customers.length()];
        for(int i = arr.length-1 ; i >= 0; i--){
            if(customers.charAt(i) == 'N') ct++;
            arr[i] = ct;
        }
        int penalty = ct;
        int index = customers.length();
        int min = ct;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<customers.length(); i++){
            if(customers.charAt(i) == 'N'){
                int remaining_cells = 
                penalty = (ct - arr[i]) +  (arr.length - i - 2) - (arr[i] - 1);
                if(penalty < min){
                   min = penalty;
                   index = i;
                }
            }
        }
        return index;
    }
}
