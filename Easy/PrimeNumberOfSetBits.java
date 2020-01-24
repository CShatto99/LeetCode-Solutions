/* Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.

(Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.) */

class Solution {
    public int countPrimeSetBits(int L, int R) {
        
        // declare a count of prime set bits
        int count = 0;
        
        // for every number in the range
        for(int i = L; i <= R; i++) {
            
            // get the setBits of the current number
            int bits = setBits(i);
            
            // because L >= 1 and R <= 10^6 we only need to check for thest primary numbers
            if(bits == 2 || bits == 3 || bits == 5 || bits == 7 || 
               bits == 11 || bits == 13 || bits == 17 || bits == 19)
                count++;
            
        }
        
        // return the final count
        return count;
        
    }
    
    // gets the number of '1' bits in a binary number
    public int setBits(int n) {
        
        // declare variable to hold the set bits
        int setBits = 0;
        
        // for every character in the binary string
        for(char c : Integer.toBinaryString.toCharArray())
            // if it is equal to '1', increment the number of set bits
            if(c == '1')
                setBits++;
        
        // return the final number of set bits
        return setBits;
        
    }
}
