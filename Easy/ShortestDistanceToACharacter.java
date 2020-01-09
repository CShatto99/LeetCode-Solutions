/* Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string. */

class Solution {
    public int[] shortestToChar(String S, char C) {
        
        // delcare an array to hold the distances and the current position
        int[] distances = new int[S.length()];
        int position = -S.length();
        
        // for every element in the array
        for(int i = 0; i < S.length(); ++i) {
            
            // if the current char is C, set position equal to the current index
            if(S.charAt(i) == C) position = i;
            
            // set the current element equal to the current index minus the position
            distances[i] = i - position;
            
        }
        
        // for every element in the array going backwards
        for(int i = S.length()-1; i >= 0; --i) {
            
            // if the current char is C, set position equal to the current index
            if(S.charAt(i) == C) position = i;
            
            // set the current element equal to the minimum bewteen the current value
            // and the absolute value of the index minus the position
            distances[i] = Math.min(distances[i], Math.abs(i - position));
            
        }
        
        // return the final distances
        return distances;
        
    }
}
