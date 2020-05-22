/* You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.
*/

class Solution {
    public boolean checkRecord(String s) {
        // variable to hold the number of As
        int numAs = 0;
        
        // for every character in the input
        for(int i = 0; i < s.length(); i++)
            // if the current character is an A, increment the 'A' counter
            if(s.charAt(i) == 'A')
                numAs++;
        
        // if the input contains more than 2 consecutive Ls or the number of As is greater than 1, return false
        if(s.contains("LLL") || numAs > 1)
            return false;
        
        // otherwise return true
        return true;
    }
}
