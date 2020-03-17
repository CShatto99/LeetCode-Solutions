/* Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them. */

class Solution {
    public String generateTheString(int n) {
        
        // initialize variable to be returned
        String ans = "";
        
        // check if the length of the string will be odd
        if(n % 2 == 1)
            // add n of the same character to the string
            for(int i = 0; i < n; i++)
                ans += "x";
        
        // otherwise the length of the string will be even
        else {
            // add n-1 of the same character to the string
            for(int i = 0; i < n-1; i++)
                ans += "x";
            
            // add one more different character to the string
            ans += "y";
        }
        
        // return the final answer
        return ans;
    }
}
