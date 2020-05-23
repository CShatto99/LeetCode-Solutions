/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

class Solution {
    public String addStrings(String num1, String num2) {
        // declare stringbuilder to hold the sum
        StringBuilder sb = new StringBuilder();
        // use i and j and indices into num1 and num2, respectively
        int i = num1.length()-1, j = num2.length()-1, carry = 0;
        
        // while we haven't reached the end of both numbers and a value needs to be carried
        while(i >= 0 || j >= 0 || carry != 0) {
            
            // if the end of num1 hasn't been reached, add the current digit to carry
            if(i >= 0) carry += num1.charAt(i--) - '0';
            
            // if the end of num2 hasn't been reached, add the current digit to carry
            if(j >= 0) carry += num2.charAt(j--) - '0';
            
            // append the remainder of dividing carry by 10 to the sum
            sb.append(carry % 10);
            // divide carry by 10
            carry /= 10;
        }
        
        // the sum was constructed in reverse order, reverse it for the final answer
        return sb.reverse().toString();
    }
}
