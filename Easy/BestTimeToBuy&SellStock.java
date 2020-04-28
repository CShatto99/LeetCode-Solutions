
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one. */

class Solution {
    public int maxProfit(int[] prices) {
        
        // create vars for the minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        
        // for every element in the input array
        for(int i = 0; i < prices.length; i++) {
            
            // if the current price is less than the minimum price, update the minimum price to the current price
            if(prices[i] < minPrice)
                minPrice = prices[i];
            
            // otherwise get the max profit between the current max profit and the current price minus the minimum price
            else
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        
        // return the final maximum profit
        return maxProfit;
    }
}
