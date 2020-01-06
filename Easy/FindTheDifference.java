/* Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t. */

class Solution {
    public char findTheDifference(String s, String t) {
        
        // declare a variable for the answer
        char diff = ' ';
        // create two hashmaps to store each char and their counts for both strings
        HashMap<Character, Integer> s_counts = new HashMap(), t_counts = new HashMap();
        
        // get the chars and their respective counts for string s
        for(char c : s.toCharArray())
            s_counts.put(c, s_counts.getOrDefault(c, 0) + 1);
        
        // get the chars and their respective counts for string t
        for(char c : t.toCharArray())
            t_counts.put(c, t_counts.getOrDefault(c, 0) + 1);
        
        // for every char in string t
        for(char c : t_counts.keySet())
            // if the char count differs between the two hashmaps, we found the answer
            if(t_counts.get(c) != s_counts.get(c))
                diff = c;
             
        // return the final answer
        return diff;
        
    }
}
