class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int max[][] = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                max[i][k++] = matrix[j][i];
            }
            k = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = max[i][j];
            }
        }
    }
}