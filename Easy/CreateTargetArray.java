/* Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid. */

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        // create output array and fill it with -1 values
        int[] output = new int[nums.length];
        Arrays.fill(output, -1);
        
        // for every element in the index array
        for(int i = 0; i < index.length; i++) {
            
            // -1 means the position in the output array is open so just copy the element over
			if(output[index[i]] < 0) {
				output[i] = nums[i];
			}
            
            // otherwise elements need to be shifted to the right
			else {
                // start the shifting at the right side of the array
				int ptr = nums.length-1;
                
                // while ptr has not reached the start of the array and
                // ptr is greater than or equal to the position that we want to insert the new element
				while(ptr > 0 && ptr >= index[i]) {
                    // shift the current element to the right
					output[ptr] = output[ptr-1];
                    // decrement the pointer index
					ptr--;
				}
                // store the element in the now open spot
				output[index[i]] = nums[i];
			}
		}
        // return the final output
        return output;
    }
}
