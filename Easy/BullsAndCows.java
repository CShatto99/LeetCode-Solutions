/* You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. 

Please note that both secret number and friend's guess may contain duplicate digits. */

class Solution {
    public String getHint(String secret, String guess) {
        
        // declare variable to hold count of bulls and cows
        int bulls = 0, cows = 0;
        
        // declare arrays to hold integer counts
        int[] secret_count = new int[10];
        int[] guess_count = new int[10];
        
        // for the length of the secret
        for(int i = 0; i < secret.length(); i++) {
            
            // if the numbers match, a bull was found
            if(secret.charAt(i) == guess.charAt(i))
                ++bulls;
            
            // otherwise, increment the counts for each array
            else {
                
                ++secret_count[secret.charAt(i) - '0'];
                ++guess_count[guess.charAt(i) - '0'];
                
            }
            
        }
        
        // loop through the count arrays and add the min of each position in the arrays to the number of cows
        for(int i = 0; i < secret_count.length; i++)
            cows += Math.min(secret_count[i], guess_count[i]);
        
        // return the answer in the correct format
        return "" + bulls + 'A' + cows + 'B';
        
    }
}
