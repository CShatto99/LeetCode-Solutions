/* Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? */

class Solution {
    public int singleNumber(int[] nums) {
        
        // declare variable to hold the answer
        int single = 0;
    
        // declare hashmap to hold the counts of each integer
        HashMap<Integer, Integer> counts = new HashMap();
        
        // for every number, increment the count
        for(int n : nums)
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        
        // for every number in the hashmap key set
        for(int n : counts.keySet())
            // if the count is 1, the single number was found
            if(counts.get(n) == 1) single = n;
        
        // return the single number
        return single;
        
    }
}
