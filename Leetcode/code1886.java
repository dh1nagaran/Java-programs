class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
    int i=0;
    while(i<4)
    {
        mat=rotate(mat);
        if(check(mat,target))
            return true;
        else
            i++;
    }
    return false;
    }
    public static boolean check(int mat[][],int target[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]!=target[i][j])
                return false;
            }
        }
        return true;
    }
    public static int[][] rotate(int mat[][])
    {
        int max[][]=new int[mat.length][mat.length];
        int k=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=mat.length-1;j>=0;j--)
            {
                max[i][k++]=mat[j][i];
            }
            k=0;
        }
        return max;
    }
}