package SkillsPw.TwoDimensionalArray;

public class SumOfMatrices 
{
    public static void main(String[] args)
     {
        int[][] mtx1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mtx2 = {{9,8,7},{6,5,4},{3,2,1}};
        int m = mtx1.length;
        int n = mtx1[0].length;
        int i = 0,j = 0;
        int[][] mtx3 = new int[m][n];
        for(i = 0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mtx3[i][j] = mtx1[i][j] + mtx2[i][j];
            }
        }
        for(i = 0;i<m;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print(mtx3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
