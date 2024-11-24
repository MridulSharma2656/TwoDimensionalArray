package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class Waveform 
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
    for( i = 0;i<m;i++)
    { 
        if (i % 2 == 0) {
            for( j = 0;j<n;j++)
            {
                System.out.print(mtx1[i][j] + " ");
            }
        }
        else
        {
      for( j = n-1;j>=0;j--)
      {
          System.out.print(mtx1[i][j] + " ");
      }
    }
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
