/* Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase. */

class Solution {
    public String toLowerCase(String str) {
        
        // convert the given string to a char array
        char[] arr = str.toCharArray();
        
        // for every character in the array
        for(int i = 0; i < arr.length; i++)
            // if the character is greater than or equal to A or less than or equal to Z
            // add 32 to the ASCII value
            if('A' <= arr[i] && arr[i] <= 'Z')
                arr[i] += 32;
        
        // return a new string with the modified char array
        return new String(arr);
        
    }
}
