class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int rowL = 0;
        int rowH = matrix[0].length - 1;
        int colL = 0;
        int colH = matrix.length - 1;
        while (rowL <= rowH && colL <= colH) {
            for (int i = rowL; i <= rowH; i++)
                li.add(matrix[colL][i]);
            colL++;

            for (int i = colL; i <= colH; i++)
                li.add(matrix[i][rowH]);
            rowH--;

            if (colL > colH || rowL > rowH)
                break;

            for (int i = rowH; i >= rowL; i--)
                li.add(matrix[colH][i]);
            colH--;

            for (int i = colH; i >= colL; i--)
                li.add(matrix[i][rowL]);
            rowL++;
        }
        return li;

    }
}