package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class RollNoMarks 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] mtx = new int[4][2];
        int m = mtx.length;
        int n = mtx[0].length;
        int i = 0, j = 0;
        while (j<n) 
        {
            while (i<m)
             {
                System.out.print("Enter Roll Number of the Student: ");
                mtx [i][j] = sc.nextInt();
                System.out.print("Enter the Marks of Student: ");
                mtx[i][j+1] = sc.nextInt();
                i++;
              }
              j++;
        }
        for(i = 0;i<m;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
