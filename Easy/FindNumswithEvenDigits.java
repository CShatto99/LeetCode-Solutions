/* Given an array nums of integers, return how many of them contain an even number of digits. */

class Solution {
    public int findNumbers(int[] nums) {
        
        // declare variable to store the count of even-length numbers
        int evenNums = 0;
        
        // for every number in the array
        for(int i = 0; i < nums.length; i++) {
            
            // declare variable to keep track of the digits
            int digits = 0;
            
            // while the current number is greater than 0
            while(nums[i] > 0) {
                
                // reduce the number by a factor of 10 and increment the number of digits
                nums[i] /= 10;
                digits++;
                
            }
            
            // if the number of digits is evenly divisible by 2 after the while loop terminates,
            // the number is even-length
            if(digits % 2 == 0)
                evenNums++;
            
        }
        
        // return the final count of even-length numbers
        return evenNums;
        
    }
}
