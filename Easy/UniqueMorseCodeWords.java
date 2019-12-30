/* International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have. */

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // store the given table into an array of strings
        String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-                ",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // declare a hashset of transformations
        Set<String> transformations = new HashSet();
        
        // for every word in the input string
        for(String word : words) {
            
            // declare a stringbuilder object
            StringBuilder wordToMorse = new StringBuilder();
            
            // for every character in the current word
            for(char c : word.toCharArray())
                // append the morse translation of the current char to the stringbuilder object
                wordToMorse.append(morseCodes[c - 'a']);
                
            // add the transformation to the hashset
            transformations.add(wordToMorse.toString());
            
        }
        
        // return the final size of the transformations hashset
        return transformations.size();
        
    }
}
