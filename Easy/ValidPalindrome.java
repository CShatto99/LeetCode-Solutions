/* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome. */

class Solution {
    public boolean isPalindrome(String s) {
        
        // if the string is empty, it is a palindrome
        if(s.length() == 0) return true;
        
        // declare two pointers for a two-pointer approach
        int left = 0, right = s.length() - 1;
        // declare variables to holp temporary chars
        char leftChar, rightChar;
        
        // while the left pointer is less than or equal to the right pointer
        while(left <= right) {
            
            // get the current left and right chars
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);
            
            // if the left char is not a letter or digit, move to the next char
            if(!Character.isLetterOrDigit(leftChar)) left++;
            
            // if the right char is not a letter or digit, move to the next char
            else if(!Character.isLetterOrDigit(rightChar)) right--;
            
            else {
                
                // if the two chars do not equal each other, it is not a palindrome
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                    return false;
                
                // increment the left pointer and decrement the right pointer
                left++;
                right--;
                
            }
            
        }
        
        return true;
    }
}
