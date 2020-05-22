/* 
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        // store the initial coordinates as a reference point and create variables to compare slopes
        int x = coordinates[0][0], y = coordinates[0][1], x1, x2, y1, y2;
        
        // for every coordinate in the input
        for(int i = 1; i < coordinates.length-1; i++) {
            // set x1, y1 equal to the current point
            x1 = coordinates[i][0];
            x2 = coordinates[i+1][0];
            // set x2, y2 equal to the next point
            y1 = coordinates[i][1];
            y2 = coordinates[i+1][1];
            
            // formula for slope between 2 points: (y2 - y1) / (x2 - x1)
            // for a straight line, the 3 points must lie on the same slope, so (y2 - y1) / (x2 - x1) = (y1 - y) / (x1 - x)
            // to avoid dividing by 0 we re-arrange the equation: (y2 - y1) * (x1 - x) = (y1 - y) * (x2 - x1)
            if((x1 - x) * (y2 - y1) != (y1 - y) * (x2 - x1))
               return false;
            
        }
    
        // return true if none of the slope caclulations return false
        return true;
    }
}
