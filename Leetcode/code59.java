class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];
        int rowL = 0;
        int rowH = n - 1;
        int colL = 0;
        int colH = n - 1;
        int k = 1;
        while (rowL <= rowH && colL <= colH) {
            for (int i = rowL; i <= rowH; i++)
                mat[colL][i] = k++;
            colL++;

            for (int i = colL; i <= colH; i++)
                mat[i][rowH] = k++;
            rowH--;

            if (rowL > rowH || colL > colH)
                break;

            for (int i = rowH; i >= rowL; i--)
                mat[colH][i] = k++;
            colH--;

            for (int i = colH; i >= colL; i--)
                mat[i][rowL] = k++;
            rowL++;
        }
        return mat;

    }
}