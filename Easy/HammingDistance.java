/* The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance. */

class Solution {
    public int hammingDistance(int x, int y) {
        
        // create variable to hold the hamming distance
        int dist = 0,
        // create variable to hold the max value of x and y
            maxInput = Math.max(x, y);
        // use Math.log(maxInput) / Math.log(2) + 1 to get the length of the binary representation
        // of the bigger number
            bits = (int)(Math.log(maxInput) / Math.log(2)) + 1
        
        // loop through every bit of the larger number
        for(int i = 0; i <= bits; i++)
            // (x >> i) & iterates through each bit in the original input
            // if the sum of the current lowest-order bits of each number is 1,
            // we know that one is 0 and the other is 1
            if(((x >> i) & 1) + ((y >> i) & 1) == 1)
                dist++;
        
        // return the final hamming distance
        return dist;
    }
}
