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
    public boolean isSymmetric(TreeNode root) {
        
        // return the truth value of the helper method
        return isMirror(root, root);
        
    }
    
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        
        // if both nodes are null, the tree is still symmetrical
        if(t1 == null && t2 == null) return true;
        
        // if only one node is null, the tree is asymmetrical
        if(t1 == null || t2 == null) return false;
        
        // check if every mirrored child contains equal values
        return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
        
    }
}
