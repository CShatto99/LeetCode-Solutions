/* A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued. */

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
    
    // declare a list to store the BST values
    List<Integer> vals = new ArrayList();
    
    public boolean isUnivalTree(TreeNode root) {
        
        // call the depth-first search method with the initial root
        dfs(root);
        
        // for every value in the values list
        for(int val : vals)
            // if the current value is not equal to the first value in the list, it is not univalued
            if(val != vals.get(0))
                return false;
        
        // otherwise, it is univalued
        return true;
    }
    
    public void dfs(TreeNode localRoot) {
        
        // if the localRoot is not null
        if(localRoot != null) {
            
            // add the current localRoot value to the list
            vals.add(localRoot.val);
            // recursively call the method with the left and right children of the local root
            dfs(localRoot.left);
            dfs(localRoot.right);
            
        }
        
    }

}
