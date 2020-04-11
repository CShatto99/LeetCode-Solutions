/* Every non-negative integer N has a binary representation.  For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.  Note that except for N = 0, there are no leading zeroes in any binary representation.

The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.  For example, the complement of "101" in binary is "010" in binary.

For a given number N in base-10, return the complement of it's binary representation as a base-10 integer. */

class Solution {
    public int bitwiseComplement(int N) {
        
        // if N is 0, the complement is 1
        if(N == 0) return 1;
        
        // variables to hold the complement and power of 2
        int complement = 0, mult = 1;
        
        // the loop will traverse each bit in N
        while(N > 0) {
            
            // if the current bit is 0 (1's complement) add the current power of 2 (mult) to the answer
            if((N % 2) == 0) complement += mult;
            
            // shift the multiplier left 1 (equivalent to mult *= 2)
            mult <<= 1;
            // shift N left 1 (equivalent to N /= 2)
            N >>= 1;
        }
        
        // return the final complement
        return complement;
    }
}
