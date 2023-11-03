// Count Nodes Equal to Average of Subtree.
// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int val = 0;
    public int tl = 0;
    public int avg = -1;
    public int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }
    public int[] helper(TreeNode root){
        if(root == null) return new int[]{0,0};
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] total = new int[]{left[0]+right[0]+root.val,left[1]+right[1]+1};
        if(total[0]/total[1] == root.val) ans++;
        return new int[]{total[0],total[1]};
    }
}
