/* Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

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
    public int maxDepth(TreeNode root) {
        
        // if the current root is null, return 0
        // otherwise return 1 + the max between the left and right nodes
        return (root == null) ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
    }
}
