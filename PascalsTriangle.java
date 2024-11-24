package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class PascalsTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n+1];
        int i = 0;
        int j = 0;
        while (i<n) 
        {
            for(j = 0;j<=(i+1); j++)
            {
            if (j == 0 || i == (j-1) ) 
            {
                arr[i][j] = 1;
            }
            else
            {
            arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
            }
         i++;
        }
        print(arr);
    }
    private static void print(int[][] arr)
    {
        int m = arr.length;
        int k = arr[0].length;
       for( int i = 0;i<m;i++)
       {
         for( int j = 0;j<k;j++)
         {
             System.out.print(arr[i][j] + " ");
         }
         System.out.println();
   }
 }
}
