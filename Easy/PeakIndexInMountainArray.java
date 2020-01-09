/* Let's call an array A a mountain if the following properties hold:

    A.length >= 3
    There exists some 0 < i < A.length - 1 such that 
    A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length    - 1]
    
Given an array that is definitely a mountain, return any i such that 
A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]. */

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
        // declare a variable to hold the peak
        int peak = 0;
        
        // for every element in the array
        for(int i = 0; i < A.length-1; i++)
            // if the next element is less than the current element, we found a peak
            if(A[i] < A[i+1])
                peak = i+1;

        // return the peak
        return peak;
        
    }
}
