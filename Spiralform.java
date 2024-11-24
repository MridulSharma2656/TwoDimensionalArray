package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class Spiralform 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of matix : ");
        int m = sc.nextInt();
        System.out.print("Enter the columns of matrix : ");
        int n = sc.nextInt();
        int[][] mtx1 = new int[m][n];
        int i = 0, j = 0;
        System.out.print("Enter the Matrix : ");
        for( i = 0;i<m;i++)
      {
        for( j = 0;j<n;j++)
        {
            mtx1[i][j] = sc.nextInt();
        }
    }
    print(mtx1);
    System.out.println();
    int minr = 0;
    int maxr = m-1;
    int minc = 0;
    int maxc = n-1;
    while (minr <= maxr && minc <= maxc)
    {
        for(j = minc;j<= maxc;j++)
        {
            System.out.print(mtx1[minr][j]+ " ");
        }
        minr++;
        if (minr > maxr || minc > maxc) break;
        for(i = minr;i<=maxr;i++)
        {
            System.out.print(mtx1[i][maxc] + " ");
        }
        maxc--;
        if (minr > maxr || minc > maxc) break;
        for(j = maxc; j >= minc; j--)
        {
            System.out.print(mtx1[maxr][j] + " ");
        }
        maxr--;
        if (minr > maxr || minc > maxc) break;
        for(i = maxr; i >=  minr; i--)
        {
            System.out.print(mtx1[i][minc] + " ");
        }
        minc++;
    }
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
