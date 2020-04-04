/* We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A. */

class Solution {
    public boolean rotateString(String A, String B) {
        
        // A must be the same length if it wants to transform into B after a certain amount of shifts.
        // So if this is true and B is in two copies of A combined together, the rotation is possible
        return A.length() == B.length() && (A+A).contains(B);
    }
}
