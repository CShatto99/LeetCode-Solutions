/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // initialize the array of answers
        int values[] = new int[2];
        
        // for every number in the array
        for(int i = 0; i < nums.length; i++) {
            
            // compare every number with every other number
            for(int j = 0; j < nums.length; j++) {
                
                // if the two current numbers sum up the target and the indices do not equal each other
                if(nums[i] + nums[j] == target & i != j) {
                    
                    // add the indicies of the two answers to the array
                    values[0] = i;
                    values[1] = j;
                }
            }
        }
        
        // return the array of answers
        return values;
    }
}
