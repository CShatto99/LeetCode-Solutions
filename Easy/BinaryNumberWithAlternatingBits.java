/* Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values. */

class Solution {
    public boolean hasAlternatingBits(int n) {
        
        // create a variable to hold the current bit
        int digit = 0;
        
        // while the input is greater than 0
        while(n > 0) {
            
            // get the current bit using % 2
            digit = (n % 2);
            
            // divide n by 2 so that n % 2 will be the next bit
            n/=2;
            
            // the bits are not alternating if the current bit (digit) is equal to the next bit (n % 2)
            if(digit == n % 2) return false;
        }
        
        // return true if we ever find an instance of non-alternating bits
        return true;
    }
}
