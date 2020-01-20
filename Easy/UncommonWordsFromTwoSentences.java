/* We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order. */

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        // declare a list to store the uncommon words
        List<String> uncommons = new ArrayList();
        // declare a hashmap to hold the occurence of each word
        HashMap<String, Integer> word_counts = new HashMap();
        
        // get the occurence of each word in String A
        for(String s : A.split("\\W+"))
            word_counts.put(s, 1 + word_counts.getOrDefault(s, 0));
        
        // get the occurence of each word in String B
        for(String s : B.split("\\W+"))
            word_counts.put(s, 1 + word_counts.getOrDefault(s, 0));
        
        // for every word that occurs
        for(String s : word_counts.keySet())
            // if the occurence of a word is 1, it is uncommon, so add it to the output list
            if(word_counts.get(s) == 1)
                uncommons.add(s);
        
        // return the String array conversion of the answer list
        return uncommons.toArray(new String[uncommons.size()]);
        
    }
}
