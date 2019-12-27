/* A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible. */

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        // declare a list to hold the self dividing numbers
        List<Integer> selfDividing = new ArrayList();
        
        // for every number in the bounds
        for(int i = left; i < right+1; i++)
            // if the current number is self dividing, add it to the list
            if(isSelfDividing(i))
                selfDividing.add(i);
    
        // return the final list
        return selfDividing;
        
    }
    
    public boolean isSelfDividing(int n) {
        
        // hold a copy of the input number
        int copy = n;
        
        // while n is greater than 0
        while(n > 0) {
            
            // get the current last digit of n
            int pop = n % 10;
            
            // if the current digit equals 0 or n is not divisible by the last digit, 
            // it is not a self dividing number
            if(pop == 0 || (copy % pop) != 0)
                return false;
            
            // reduce n by a factor of 10 to move to the next digit
            n /= 10;
            
        }
        
        // return true otherwise
        return true;
        
    }
}
