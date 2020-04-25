/*Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after applying the increment to all indices. */

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        
        // create variables for the output array and number of odd values
        int[][] ans = new int[n][m];
        int oddValues = 0;
        
        // for every row-column pairs in the input array
        for(int i = 0; i < indices.length; i++) {
            
            // extract the row and column that we want to increment by 1
            int targetRow = indices[i][0];
            int targetColumn = indices[i][1];
            
            // increment every element in the target row by 1
            for(int j = 0; j < m; j++)
                ans[targetRow][j]++;
            
            // increment every element in the target column by 1
            for(int j = 0; j < n; j++)
                ans[j][targetColumn]++;
        }
        
        // loop through every cell in the modified array
        // if any of the elements is not evenly divisible by 2 (odd) increment the odd value counter
        for(int i = 0; i < ans.length; i++)
            for(int j = 0; j < ans[0].length; j++)
                if(ans[i][j] % 2 == 1) oddValues++;

        // return the final count of odd values
        return oddValues;
    }
}
