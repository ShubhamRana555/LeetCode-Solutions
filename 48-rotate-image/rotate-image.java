class Solution {
    public void rotate(int[][] matrix) {
        // reversing elements of a particular row
        int row = matrix.length;
        int col = matrix[0].length;
        
        //reverse matrix
        transpose(matrix);
        reverse(matrix);



    }
    public void reverse(int [][]mat){
        //reversing elements of every row
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            int first = 0, last = row-1;
            while(first <= last){
                //swap
                int temp = mat[i][first];
                mat[i][first] = mat[i][last];
                mat[i][last] = temp;
                first++;
                last--;
            }
        }
    }
    public void transpose(int [][]mat){
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            for(int j = i+1;j<col;j++){
                //swap
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}