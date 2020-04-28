/* Given an integer, return its base 7 string representation. */

class Solution {
    public String convertToBase7(int num) {
        
        // if num is negative. add a negative sign to the recursive return value of -num
        if(num < 0) return "-" + convertToBase7(-num);
        
        // if num is less than 7, there is no more converting to do, return the value as is
        else if(num < 7) return Integer.toString(num);
        
        // if num greater than 7, append the remainder of num / 7 (num % 7) 
        // to the recursive call of the current num divided by 7
        return convertToBase7(num / 7) + Integer.toString(num % 7);
    }
}
