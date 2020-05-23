/*
Given an integer n, return the number of trailing zeroes in n!.
*/
class Solution {
    public int trailingZeroes(int n) {
        int zeroes = 0;
        while (n != 0) {
            zeroes += n /= 5;
        }
        return zeroes;
    }
}
