/* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements. */

class Solution {
    public void moveZeroes(int[] nums) {
        
        // hold a "insert position" index
        int insertPosition = 0;
        
        // for every integer in the nums array
        for(int num : nums)
            // if the current does not equal 0, insert it to the front of the aray and increment the index
            if(num != 0)
                nums[insertPosition++] = num;
        
        // while the insert position is less than the length of the array, insert zeros in the remaining places
        while(insertPosition < nums.length)
            nums[insertPosition++] = 0;
        
    }  
}
