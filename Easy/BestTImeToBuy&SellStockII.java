/*
Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
*/

class Solution {
    public int maxProfit(int[] prices) {
        // variable to hold the maximum profit
        int total = 0;
        
        // for every stock price in the input
        for(int i = 0; i < prices.length-1; i++)
            // if the next stock price is greater than the current stock price,
            // add the difference of the two prices to the total
            if(prices[i] < prices[i+1])
                total += prices[i+1] - prices[i];
        
        // return the total
        return total;
    }
}
