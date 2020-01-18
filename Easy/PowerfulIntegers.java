/* Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.

Return a list of all powerful integers that have value less than or equal to bound.

You may return the answer in any order.  In your answer, each value should occur at most once. */

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        // declare a list to hold the powerful integers
        List<Integer> powerful = new ArrayList();
        // declare a limit for the integers
        int limit = (int) (Math.pow(bound, .5));
        
        // for every i less than or equal to the limit
        for(int i = 0; i <= limit; i++) {
            // for evrery y less than or equal to the limit
            for(int j = 0; j <= limit; j++) {
                
                // get the current integer using the provided formula
                int current = (int)(Math.pow(x, i)) + (int)(Math.pow(y, j));
                
                // if the result is non-negative, less than or equal to the bound,
                // is not already in the list of powerful integers, add it to the list
                if(0 <= current && current <= bound && !powerful.contains(current))
                    powerful.add(current);
                
            }
        }
        
        // return the final list
        return powerful;
        
    }
}
