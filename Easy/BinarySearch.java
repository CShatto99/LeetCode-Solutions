/* Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1. */

class Solution {
    public int search(int[] nums, int target) {
        
        // create variables to keep track of the left and right search bounds
        int left = 0, right = nums.length-1;
        
        // while the bounds have not been crossed
        while(left <= right) {
            
            // get the current midpoint
            int mid = left + (right - left) / 2;
            
            // if the current middle element is equal to the target, return its index
            if(nums[mid] == target) return mid;
            
            // if the current middle element is less than the target, move the left bound one past the middle
            else if(nums[mid] < target) left = mid + 1;
            
            // if the current middle element is greater than the target, move the right bound one before the middle
            else right = mid - 1;
            
        }
        
        // return -1 if the target is not found
        return -1;
    }
}
