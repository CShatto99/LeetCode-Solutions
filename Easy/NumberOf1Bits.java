/* Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight). */

public class Solution {
    public int hammingWeight(int n) {
        
        // variable to hold the hamming weight
        int weight = 0;
        
        // each loop will shift n by 1 and the max value of an int is (2^31)-1 so loop up to 31
        for(int i = 0; i < 32; i++)
            // shift right by i bits and mask with 1
            // if the result is 1 increase the weight
            if(((n >> i) & 0x1) == 1) weight++;
        
        // return the final hamming weight
        return weight;
    }
}
