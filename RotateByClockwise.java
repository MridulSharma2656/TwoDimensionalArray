package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class RotateByClockwise 
{
    public static void main(String[] args)
 {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of matix : ");
        int m = sc.nextInt();
        System.out.print("Enter the columns of matrix : ");
        int n = sc.nextInt();
        int[][] mtx1 = new int[m][n];
        int[][] mtx2 = new int[n][m];
        int i = 0, j = 0;      
        System.out.print("Enter the Matrix : ");
        for( i = 0;i<m;i++)
      {
        for( j = 0;j<n;j++)
        {
            mtx1[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    print(mtx1);
    System.out.println();
    for( i = 0; i<m; i++)
    {
      for( j = 0; j<i ; j++)
      {
        int s = mtx1[i][j];
        mtx1[i][j] = mtx1[j][i];
        mtx1[j][i] = s;
      }
    }
    print(mtx1);
    System.out.println();
    for(j = 0;j<m;j++)
    {
        for(i = 0;i<(m-1);)
        {
            int a = m-1;
            int x = mtx1[j][i];
            mtx1[j][i] = mtx1[j][a];
            mtx1[j][a] = x;
            i++;
            a--;
        }
    }
    print(mtx1);
}
    private static void print(int[][] mtx1) 
    {
        int m = mtx1.length;
        int n = mtx1[0].length;
       for( int i = 0;i<m;i++)
       {
         for( int j = 0;j<n;j++)
         {
            System.out.print(mtx1[i][j] + " ");
         }
         System.out.println();
        }
    }
}

