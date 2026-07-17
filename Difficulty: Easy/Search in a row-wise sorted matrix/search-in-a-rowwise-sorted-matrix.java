

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            int low = 0;
            int high = cols - 1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mat[i][mid] == x)
                    return true;
                else if (mat[i][mid] < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}