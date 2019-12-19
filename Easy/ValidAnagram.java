/* Given two strings s and t , write a function to determine if t is an anagram of s. */

class Solution {
    public boolean isAnagram(String s, String t) {
        
        // if the lengths do not match, they are not anagrams
        if(s.length() != t.length())
            return false;
        
        // declare count array for both strings
        int[] sCounts = new int[128], tCounts = new int[128];
        
        // for every character in each array
        for(int i = 0; i < s.length(); i++) {
            
            // get the current char and increment the count of that char
            char sChar = s.charAt(i);
            sCounts[sChar]++;
            
            // get the current char and increment the count of that char
            char tChar = t.charAt(i);
            tCounts[tChar]++;
            
        }
        
        // for every count of each array
        for(int i = 0; i < sCounts.length; i++)
            // if one of the counts does not match, they are not anagrams
            if(sCounts[i] != tCounts[i])
                return false;
        
        return true;
    }
}
