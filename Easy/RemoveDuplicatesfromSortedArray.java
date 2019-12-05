/* Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory. */

class Solution {
    public int removeDuplicates(int[] nums) {
        
        // if the array is empty return 0
        if(nums == null) return 0;
        
        // declare an index
        int i = 0;
        
        // for every number in the array starting at the second element
        for(int j = 1; j < nums.length; j++) {
            
            // if the element of index i does not equal the current element in the loop
            if(nums[i] != nums[j]) {
                
                // increment i
                i++;
                // set the element of i equal to the next distinct integer
                nums[i] = nums[j];
                
            }
            
        }
        
        // i will be the index of the last distinct integer in the array
        // so return the length of the subarray that contains every distinct integer
        return i + 1;
    }
}
