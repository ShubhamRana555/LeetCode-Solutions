class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        int row = n-1, col = 0;

        while(row >= 0 && col < m){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
}