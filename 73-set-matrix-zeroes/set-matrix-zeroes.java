class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer> >res = new ArrayList<ArrayList<Integer> >();
        int iter = 0;
        for(int i=0;i<matrix.length;i++){
            for(int  j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    res.add(new ArrayList<>());
                    res.get(iter).add(i);
                    res.get(iter).add(j);
                    iter++;
                }
            }
        }

        for(int i = 0;i<res.size();i++){
            int row = res.get(i).get(0);
            int col = res.get(i).get(1);
            for(int k = 0;k < matrix.length;k++){
                matrix[k][col] = 0;
            }
            for(int k = 0;k < matrix[0].length;k++){
                matrix[row][k] = 0;
            }
        }
    }
}