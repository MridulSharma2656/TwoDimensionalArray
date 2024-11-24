package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class SearchATwoDMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of matix : ");
        int m = sc.nextInt();
        System.out.print("Enter the columns of matrix : ");
        int n = sc.nextInt();
        int[][] mtx = new int[m][n];
        int i = 0, j = 0;
        System.out.print("Enter Matrix : ");
        for( i = 0;i<m;i++)
      {
        for( j = 0;j<n;j++)
        {
            mtx[i][j] = sc.nextInt();
        }
    }
    print(mtx);
    System.out.println();
    System.out.println("Enter the target element : ");
    int x = sc.nextInt();
    int a = 0, b = 0;
    for( i = 0;i<m;i++)
      {
        if (mtx[i][0] <= x) 
        {
             a = i;
            break;
        }
    }
    for(i = m-1;i>=0;i--)
    {
        if (mtx[i][n-1] <= x) 
        {
             b = i;
            break;
        }
    }
    for( i = 0;i<a;i++)
    {
      for( j = 0;j<n;j++)
      {
         if (mtx[i][j] == x) 
         {
            System.out.println("Element found");
         }
      }
  }
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
