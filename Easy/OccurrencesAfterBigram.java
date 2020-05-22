/*
Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

For each such occurrence, add "third" to the answer, and return the answer.
*/

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        // declare occurrences list and String array for tokenizing the input text
        ArrayList<String> occurrences = new ArrayList<String>();
        String[] tokens = text.split("\\s+");
        
        // for every token in the token array
        for(int i = 1; i < tokens.length-1; i++)
            // if the previous token equals the "first" string and the current token equals the "second" string,
            // add the next token to the occurrences list
            if(tokens[i-1].equals(first) && tokens[i].equals(second))
                occurrences.add(tokens[i+1]);
        
        // return the string conversion of the occurrences list
        return occurrences.toArray(new String[occurrences.size()]);
    }
}
