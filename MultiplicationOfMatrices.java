package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class MultiplicationOfMatrices 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of matix 1 : ");
        int m = sc.nextInt();
        System.out.print("Enter the columns of matrix 1 : ");
        int n = sc.nextInt();
        int[][] mtx1 = new int[m][n];
        int i = 0, j = 0;
        System.out.print("Enter Matrix 1 : ");
        for( i = 0;i<m;i++)
      {
        for( j = 0;j<n;j++)
        {
            mtx1[i][j] = sc.nextInt();
        }
    }
    print(mtx1);
    System.out.println();
    System.out.print("Enter the rows of matix 2 : ");
        int a = sc.nextInt();
        System.out.print("Enter the columns of matrix 2 : ");
        int b = sc.nextInt();
        int[][] mtx2 = new int[a][b];
         i = 0; j = 0;
        System.out.print("Enter Matrix 2 : ");
        for( i = 0;i<a;i++)
      {
        for( j = 0;j<b;j++)
        {
            mtx2[i][j] = sc.nextInt();
        }
    }
    print(mtx2);
    System.out.println();
    int[][] mtx3 = new int[m][b];
    i = 0;
    if (n != a) 
    {
        System.out.println("Multiplication Not Possible");
    }
    else
    {
    while (i<m)
    {
        for(j = 0;j<b;j++)
        {
            for(int k = 0;k<a;k++)
            {
                mtx3[i][j] += ( mtx1[i][k] * mtx2[k][j]);
            }
        }
        i++;
    }
}
    print(mtx3);
    }
    private static void print(int[][] mtx)
    {
        int m = mtx.length;
        int n = mtx[0].length;
       for( int i = 0;i<m;i++)
       {
         for( int j = 0;j<n;j++)
         {
             System.out.print(mtx[i][j] + " ");
         }
         System.out.println();
   }
 }
}
