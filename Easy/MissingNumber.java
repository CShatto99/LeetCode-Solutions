/* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array. */

class Solution {
    public int missingNumber(int[] nums) {
        
        // declare variable to hold a sum
        int sum = 0;
        // get the total sum of the all nums in the array using n*(n+1) / 2
        int total = (nums.length * (nums.length + 1)) / 2;
        
        // for every num in the nums array
        for(int n : nums)
            // add it to the sum
            sum += n;
        
        // return the complement of the sum (missing number)
        return total - sum;
        
    }
}
