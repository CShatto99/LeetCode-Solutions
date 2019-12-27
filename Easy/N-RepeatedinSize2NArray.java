/* In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times. */

class Solution {
    public int repeatedNTimes(int[] A) {
        
        // declare an index, a current occurence, and the target occurence
        int index = 0, currentOccurence = 1, targetOccurence = A.length / 2;
        
        // sort the input array
        Arrays.sort(A);
        
        // while the end of the array has not been reached
        while(index < A.length) {
            
            // increment the occurence of the current integer
            currentOccurence++;
    
            // if the current integer is not equal to the next integer, reset the current occurence
            if(A[index] != A[index+1])
                currentOccurence = 1;
            
            // if the current occurent is equal to the target occurence, we found a match so break from the loop
            if(currentOccurence == targetOccurence)
                break;
            
            // increment the index
            index++;
            
        }
        
        // return the element of the index of the iteration that broke the loop
        return A[index];
        
    }
}
