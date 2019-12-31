/* Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree. */

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        // if t2 has no value, return t1
        if(t2 == null)
            return t1;
        
        // if t1 has no value, return t2
        if(t1 == null)
            return t2;
        
        // add the value of t2 to the value of t1
        t1.val += t2.val;
        
        // set the left child of t1 equal to the recursive call using the left children of t1 and t2
        t1.left = mergeTrees(t1.left, t2.left);
        // set the right child of t1 equal to the recursive call using the right children of t1 and t2
        t1.right = mergeTrees(t1.right, t2.right);
        
        // return the merged tree
        return t1;
        
    }
}
