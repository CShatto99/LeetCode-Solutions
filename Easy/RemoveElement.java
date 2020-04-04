/* Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length. */

class Solution {
    
    // solution created by myself
    public int removeElementOC(int[] nums, int val) {
        
        // variable to hold the number of elements removed
        int matches = 0;
        
        // loop through every element
        for(int i = 0; i < nums.length; i++) {
            
            // if the current element matches val
            if(nums[i] == val) {
                
                // set the current element to the max int value
                nums[i] = Integer.MAX_VALUE;
                // increase the number of matches
                matches++;
                
            }
        }
        
        // sort the input array, the remove elements were replaced by the maximum possible number
        // so they will be at the end of the array.
        Arrays.sort(nums);
        
        // return only the reference to the unchagned elements 
        return nums.length-matches;
    }
    
    // LeetCode solution
    public int removeElement(int[] nums, int val) {
        
        // variable for the slower index
        int i = 0;
        
        // loop through every element
        for (int j = 0; j < nums.length; j++) {
            
            // if the current element is not equal to val
            if (nums[j] != val) {
                // set the next i-indexed element to the next valid number
                nums[i] = nums[j];
                // increment the i index
                i++;
            }
        }
        
        // i will be at the last index we care about so return it
        return i;
    }
}
