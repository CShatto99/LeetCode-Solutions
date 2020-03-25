/* Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // initialize a hashset to hold each unique occurence of the numbers in nums
        Set<Integer> uniqueNums = new HashSet<Integer>();
        
        // for every integer in nums
        for(Integer n : nums) {
            // if the hashset already contains the current element, we found a duplicate
            if(uniqueNums.contains(n))
                return true;
            
            // otherwise add it to the hashset
            uniqueNums.add(n);
        }
        
        // return false if we never return true
        return false;
    }
}
