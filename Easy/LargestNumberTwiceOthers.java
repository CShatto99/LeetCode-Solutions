/* In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1. */

class Solution {
    public int dominantIndex(int[] nums) {
        
        // declare variable for the max and its index
        int max = Integer.MIN_VALUE, indexOfMax = -1;
        
        // for ever number in the array
        for(int i = 0; i < nums.length; i++) {
            
            // if the current num is greater than the current max
            if(nums[i] > max) {
                
                // reassign the index of the max and the max so far
                indexOfMax = i;
                max = nums[i];
                
            }
        }
        
        // for every num in the array
        for(int i = 0; i < nums.length; i++)
            // if the current num is different and is less than 2 times any of the other nums,
            // no answer exists
            if(indexOfMax != i && max < 2*nums[i])
                return -1;
            
        // return the answer if it exists
        return indexOfMax;
        
    }
}
