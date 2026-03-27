class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = mat[i][j];
            }
        }
        k=k%n;
        int p = 1;
        while (p <= k) {
            for (int i = 0; i < m; i++) {
                int[] tempRow = new int[n]; 
                if (i % 2 == 0) {
                    for (int j = 0; j < n-1; j++) {
                        tempRow[j] = matrix[i][j+1];
                    }
                    tempRow[n-1]=matrix[i][0];
                } else {
                    for (int j = 1; j < n; j++) {
                        tempRow[j] = matrix[i][j-1];
                    }
                    tempRow[0]=matrix[i][n-1];
                }
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = tempRow[j];
                }
            }
            p++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != mat[i][j])
                    return false;
            }
        }

        return true;
    }
}