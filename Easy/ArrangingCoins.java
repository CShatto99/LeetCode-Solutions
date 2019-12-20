class Solution {
    public int arrangeCoins(int n) {
        
        // declare the inital step
        int step = 1;
        
        // while we still have enough coins in n to make a new step
        while(n >= step) {
            
            // substract the number of coins it took to make the current step from the total coins
            n -= step;
            // move to the next step
            step++; 
        }
        
        // return the answer, step - 1
        return step - 1;
    }
}
