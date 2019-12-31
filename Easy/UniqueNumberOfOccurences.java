/* Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique. */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // create a map to store the occurences of each integer
        Map<Integer, Integer> occurences = new HashMap();
        
        // for each integer in the array
        for(int n : arr)
            // store the integer and 1 + the current occurences
            occurences.put(n, 1 + occurences.getOrDefault(n, 0));
        
        // return true if the size of the hashmap is equal to the size of a hashset
        // containing the values of the hashmap
        return occurences.size() == new HashSet(occurences.values()).size();
        
    }
}
