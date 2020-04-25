/* Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children. */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        // if the root is null there are no available paths to traverse, return false.
        if(root == null) return false;
        
        // if both children are null (leaf node) check if the current sum equals the roots value
        if(root.left == null && root.right == null) return sum == root.val;
        
        // return the OR of two recursive calls
        // the recursive call's parameters are the child nodes and the current sum minus the root's value.
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
