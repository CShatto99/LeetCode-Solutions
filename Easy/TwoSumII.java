/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // declare the initial left and right boundaries for a binary search
        int left = 0, right = numbers.length-1;
        
        // while the left boundary has not crossed the right boundary
        while(left < right) {
            
            // if the two numbers being pointed to add up to the target, we found the answers
            if(numbers[left] + numbers[right] == target)
                break;
            
            // if the sum of the two numbers being pointed to is less than the target, we need a larger sum
            else if(numbers[left] + numbers[right] < target)
                left++;
            
            // otherwise, we need a smaller sum
            else
                right--;
            
        }
        
        // return the non-zero-based indicies of the answers
        return new int[]{left + 1, right + 1};
        
    }
}
