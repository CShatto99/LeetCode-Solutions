/* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A". */

class Solution {
    public int numJewelsInStones(String J, String S) {
        
        // declare variable to keep track of jewels
        int jewels = 0;
        
        // for every jewel
        for(int i = 0; i < J.length(); i++) {
            
            // get the current jewel
            char currentJewel = J.charAt(i);
            
            // for every stone
            for(int j = 0; j < S.length(); j++) {
                
                // get the current stone
                char currentStone = S.charAt(j);
                
                // if the current stone is equal to the current jewel, increment the number of jewels
                if(currentStone == currentJewel)
                    jewels++;
                
            }
            
        }
        
        return jewels;
    }
}
