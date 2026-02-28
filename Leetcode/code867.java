class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int matrixx[][]=new int[columns][rows];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
                matrixx[j][i]=matrix[i][j];
        }
        return matrixx;
        
    }
}