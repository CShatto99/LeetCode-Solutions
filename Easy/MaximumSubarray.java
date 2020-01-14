/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum. */

class Solution {
    public int maxSubArray(int[] nums) {
        
        // declare variables to hold maxes
        int maxSoFar = nums[0], newMax = nums[0];
        
        // for every num in the array
        for(int i = 1; i < nums.length; i++) {
            
            // set the new max to the max between the current element + the next element
            // and the next element
            newMax = Math.max(newMax + nums[i], nums[i]);
            
            // if the new max is greater than the max so far, reassign the max so far
            maxSoFar = Math.max(maxSoFar, newMax);
            
        }
        
        // return the final max
        return maxSoFar;
        
    }
}
