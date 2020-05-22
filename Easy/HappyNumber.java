/*
Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.
*/

class Solution {
    public boolean isHappy(int n) {
        // variable to hold all known sum of squares of n
        Set<Integer> squareNums = new HashSet<Integer>();
        
        // while we can still add the current sum of squares to the set (no loop encountered)
        while(squareNums.add(n)) {
            
            // set the initial sum to o
            int sum = 0;
            
            // while n is greater than 0
            while(n > 0) {
                // n % 10 will give the lowest-order digit of n, so square it and add it to the sum
                sum += (n % 10)*(n % 10);
                // reduce n by a factor of 10
                n /= 10;
            }
            
            // if the number equals 1, it satisfies the condition
            if(sum == 1) return true;
            // otherwise, update n accordingly
            else n = sum;
        }
        
        // return false if we never return true
        return false;
    }
}
