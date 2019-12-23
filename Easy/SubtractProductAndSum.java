/* Given an integer number n, return the difference between the product of its digits and the sum of its digits. */

class Solution {
    public int subtractProductAndSum(int n) {
        
        // declare variables to store the product and sum
        int product = 1, sum = 0;
        
        // while the given number is greater than 0
        while(n > 0) {    
            
            // last digit = n % 10, Ex: 12 % 10 = 2
            // set the product equal to itself times the last digit of n
            product *= n % 10;
            // set the sum equal to itself and the last digit of n
            sum += n % 10;
            
            // reduce n by a factor of 10
            n /= 10;
            
        }
        
        // return the difference between the product and the sum
        return product - sum;
        
    }
}
