/*
Share
Given two integer arrays startTime and endTime and given an integer queryTime.

The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].

Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
*/

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        // declare variable to hold the number of busy students
        int busyCount = 0;
        
        // for every startTime-endTime pair in the input
        for(int i = 0; i < startTime.length; i++)
            // what we want to do is check for over lap between startTime to endTime and queryTime
            // if startTime is < queryTime and endTIme is > queryTime or startTime = queryTime or endTime = queryTime,
            // there is obviously some overlap, so increment the busy counter
            if((startTime[i] < queryTime && endTime[i] >= queryTime) || startTime[i] == queryTime || endTime[i] == queryTime)
                busyCount++;
        
        // return the final number of busy students
        return busyCount;
    }
}
