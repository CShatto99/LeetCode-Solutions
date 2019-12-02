/* Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward. */

class Solution {
    public boolean isPalindrome(int x) {
        
        // if x is negative or x is evenly divisible by 10 and x is not equal to 0, return false
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        
        // declare and initialize a reversed variable
        int rev = 0;
        
        // while x is greater than the reversed variable
        while(x > rev) {
            
            // multiply reversed by 10 and add the last digit of x (x % 10) to reversed
            rev = (rev * 10) + (x % 10);
            
            // remove the last digit of x by dividing it by 10
            x /= 10;
            
        }
        
        // return true if x is equal to reversed or x is equal to reversed divided by 10 (case in which the         // length of x is odd)
        return x == rev || x == rev/10;
    }
}
