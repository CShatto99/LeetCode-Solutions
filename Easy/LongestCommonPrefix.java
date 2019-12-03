/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "". */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // if the length of the string is 0, the string is empty
        if(strs.length == 0) return "";
        
        // initialize a starting prefix as the entire first word
        String prefix = strs[0];
        
        // for every word starting with the second
        for(int i = 1; i < strs.length; i++) {
            
            // while the current prefix is not a substring of the current word
            while(strs[i].indexOf(prefix) != 0) {
                
                // remove the last letter from the current prefix
                prefix = prefix.substring(0, prefix.length()-1);
                // if the prefix is now empy, there is no common prefix, return an empty string
                if(prefix.isEmpty()) return "";
                
            }
            
        }
        
        // return the final prefix
        return prefix;
    }
}
