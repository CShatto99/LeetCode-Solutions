/* Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings. */

class Solution {
    public int balancedStringSplit(String s) {
        
        // declare a counter and a variable to hold the # of balanced strings
        int counter = 0, pairs = 0;
        
        // for every letter in the string
        for(int i = 0; i < s.length(); i++) {
                        
            // if the current letter is an 'R' increase the counter
            if(s.charAt(i) == 'R') counter++;
            
            // if the current letter is an 'L' decrease the counter
            else counter--;
            
            // if the current value of the counter is 0, a pair has been found
            if(counter == 0) pairs++;
            
        }
        
        // return the final # of pairs found
        return pairs;
        
    }
}
