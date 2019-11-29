/* Given a 32-bit signed integer, reverse digits of an integer. */

class Solution {
    public int reverse(int x) {
        
        // declare the reversed integer and the pop variable
        int reversed = 0;
        int pop;
        
        // while x is not equal to zero
        while(x != 0) {
            
            // get the pop value, this will be equal to the last digit in x
            pop = x % 10;
            
            // reduce the x value, this will remove the last digit of the x value
            x /= 10;
            
            // check for integer overflow
            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 7)
                return 0;
        
            // check for integer underflow
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8)
                return 0;
            
            // build the reversed string
            reversed = (reversed * 10) + pop;
            
        }
        
        // return the reversed string
        return reversed;
    }
}
