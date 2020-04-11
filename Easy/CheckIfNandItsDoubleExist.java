/* Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j] */

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // create a set to store the array
        Set<Integer> nums = new HashSet();
        
        // for every number in the array
        for(Integer n : arr) {
            // if the set contains the current number's double or
            // the current number is even and the set contains the current number's half, return true
            if(nums.contains(2*n) || (n%2 == 0 && nums.contains(n/2))) return true;
            
            // add the current number if nothing is returned
            nums.add(n);
        }
        
        // return false if we loop through the whole array and never return true
        return false;
    }
}
