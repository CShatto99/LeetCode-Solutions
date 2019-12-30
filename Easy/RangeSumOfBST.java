/* Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values. */

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
    
    // declare a variable to hold the sum
    int sum = 0;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        // if the root is null, return 0
        if(root == null)
            return 0;
        
        // if the value of the root is between the bounds, add it to the sum
        if(L <= root.val && root.val <= R)
            sum+=root.val;
        
        // recursively call the method using the left and right children of the root
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        
        // return the final sum
        return sum;
        
    }
}
