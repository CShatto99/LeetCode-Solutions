/* Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters. */

class Solution {
    public void reverseString(char[] s) {
        
        // loop through half the array for the two-pointer approach
        for(int i = 0; i < s.length/2; i++) {
            
            // swap the current left char (i) with the current right char (s.length-i-1)
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
            
        }
    }
}
