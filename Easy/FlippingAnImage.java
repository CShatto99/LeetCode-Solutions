/* Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0]. */

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        // hold the number of rows and columns in variables
        int rows = A.length, columns = A[0].length;
        
        // for every row
        for(int i = 0; i < rows; i++) {
            
            // for half of the columns
            for(int j = 0; j < columns/2; j++) {
                
                // swap the column values using a two-pointer approach
                int temp = A[i][j];
                A[i][j] = A[i][columns-j-1];
                A[i][columns-j-1] = temp;
                
            }
            
            // for every column
            for(int j = 0; j < columns; j++)
                // if the value of the column is 1, change it to 0 and vice versa
                A[i][j] = (A[i][j] == 1) ? 0 : 1;

        }
        
        // return the modified 2D array
        return A;
        
    }
}
