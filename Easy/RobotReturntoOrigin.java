/* There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false. */

class Solution {
    public boolean judgeCircle(String moves) {
        
        // declare variables to hold x and y position
        int x = 0, y = 0;
        
        // for every move in the input string
        for(char move : moves.toCharArray()) {
            
            // moving up = increment y pos
            if(move == 'U') y++;
            // movding down = decrement y pos
            if(move == 'D') y--;
            // moving right = increment x pos
            if(move == 'R') x++;
            // moving left = decrement x pos
            if(move == 'L') x--;
            
        }
        
        // return true if the x and y values match the origin
        return (x == 0 && y == 0);
        
    }
}
