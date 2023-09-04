class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int startRow = 0 , startCol = 0;
        int endCol = matrix[0].length-1;
        int endRow = matrix.length-1;
        while(startRow<=endRow && startCol<=endCol){
        //top - boundary
        for(int i=startCol;i<=endCol;i++){
            res.add(matrix[startRow][i]);
        }
        //right - boundary
        for(int i=startRow+1;i<=endRow;i++){
            res.add(matrix[i][endCol]);
        }
        //bottom - boundary
        for(int i=endCol-1;i>=startCol;i--){
            if(startRow == endRow){
                break;
            }
            res.add(matrix[endRow][i]);
        }
        //left - boundary
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol == endCol){
                break;
            }
            
            res.add(matrix[i][startCol]);
        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
        }

    return res;
    }
}