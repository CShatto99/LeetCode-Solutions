/* Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -. */

class Solution {
    public int getSum(int a, int b) {
        
        // if a is zero, the sum is only b
        if(a == 0) return b;
        
        // if b is zero, the sum is only a
        if(b == 0) return a;
        
        // declare a variable to hold the carry value
        int carry = 0;
        
        // while there are still bits to check in b
        while(b != 0) {
            
            // If both bits are 1, we set the bit to the left (<<1) to 1 -- this is the carry step
            carry = (a & b) << 1;
            
            // update a
            // If both bits are 1, this will give us 0 (we will have a carry from the step above)
            // If only 1 bit is 1, this will give us 1 (there is nothing to carry)
            a = a ^ b;
            
            // set b to the value of carry
            b = carry;
        }
        
        // because a is updated every loop, it will be the sum at the end of the loop
        return a;
    }
}
