/* 
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        
        // hold the length of the array in a variable
        int n = digits.length;
        
        // for every number in the array starting at the end
        for(int i=n-1; i>=0; i--) {
            
            // if the digit is less than 9
            if(digits[i] < 9) {
                
                // increment the digit and return the array
                digits[i]++;
                return digits;
                
            }

            // if the digit is equal to 9, set it to 0 and continue the loop
            digits[i] = 0;
            
        }

        // if the loop never returns an array, every digit was a 9 so, 
        // create a new array with one more element
        int[] newNumber = new int [n+1];
        
        // set the first element to 1
        newNumber[0] = 1;

        // return the new array
        return newNumber;
    }
}
