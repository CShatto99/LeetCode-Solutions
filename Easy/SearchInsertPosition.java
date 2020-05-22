/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // return the return value of the recursive search method
        return recursiveSearchInsert(nums, target, 0, nums.length);
        
    }
    
    public int recursiveSearchInsert(int[] nums, int target, int left, int right) {
        
        // declare the index to be returned
        int index = 0;
        
        // if the left pointer passes the right pointer, the search is complete
        if(left >= right)
            // set the index equal to the left pointer
            index = left;
        
        // otherwise, execute a binary search
        else {
            
            // calculate the current middle index 
            int middle = left + (right - left) / 2;
            
            // if the target is equal to the current middle index
            if(target == nums[middle])
                // set the index equal to the current middle index
                index = middle;
            
            // if the target is less than the middle element
            else if(target < nums[middle])
                // set the index to the recursive call with the middle index as the right boundary
                index = recursiveSearchInsert(nums, target, left, middle);
            
            else
                // set the index to the recursive call with the middle index + 1 as the left boundary
                index = recursiveSearchInsert(nums, target, middle+1, right);
            
        }
        
        return index;
        
    }
    
}
