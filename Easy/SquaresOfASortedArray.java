/* Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order. */

class Solution {
    public int[] sortedSquares(int[] A) {
        
        // for every integer in the array
        for(int i = 0; i < A.length; i++)
            // set the integer equal to itself squared
            A[i] *= A[i];
        
        // sort the modified array
        Arrays.sort(A);
        
        // return the modified array
        return A;
        
    }
}
