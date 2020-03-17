/* Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array. */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        // initialize the answer array, its' index, and a counter for the smaller values
        int[] answers = new int[nums.length];
        int index = 0, smaller;
        
        // for every number in the array
        for(int i = 0; i < nums.length; i++) {
            
            // initialize the smaller number count to 0 for every outer loop
            smaller = 0;
            
            // for every number in the array
            for(int j = 0; j < nums.length; j++)
                // if the positions of the numbers differ and the current inner number is less than 
                // the current outer number, increment the smaller number counter
                if(i != j && nums[j] < nums[i])
                    smaller++;
            
            // add the number of elements that were smaller than nums[i] to the answer array
            answers[index++] = smaller;
        }
        
        // return the final answer
        return answers;
    }
}
