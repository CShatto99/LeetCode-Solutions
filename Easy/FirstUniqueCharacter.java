/* Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1. */

class Solution {
    public int firstUniqChar(String s) {
        
        // create hashmap to store the letters and their occurences
        HashMap<Character, Integer> letterToCount = new HashMap();
        
        // store the occurences of each letter
        for(char c : s.toCharArray())
            letterToCount.put(c, 1 + letterToCount.getOrDefault(c, 0));
        
        // loop through the entire string
        for(int i = 0; i < s.length(); i++)
            // if the current character occurs only once, return its' index
            if(letterToCount.get(s.charAt(i)) == 1)
                return i;
        
        // otherwise, return -1
        return -1;
    }
}
