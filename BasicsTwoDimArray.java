package SkillsPw.TwoDimensionalArray;
import java.util.Scanner;
public class BasicsTwoDimArray {
    public static void main(String[] args) {
        int[][] mtx = new int[3][3];
        int m = mtx.length;
        int n = mtx[0].length;
        System.out.println(m + " " + n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers:");
        // mtx[0][0] = 1;
        // mtx[0][1] = 1;
        // mtx[0][2] = 1;
        // mtx[1][0] = 1;
        // mtx[2][0] = 1;
        // mtx[1][1] = 1;
        // mtx[1][2] = 1;
        // mtx[2][2] = 1;
        // mtx[2][1] = 1;
      for(int i = 0;i<3;i++)
      {
        for(int j = 0;j<3;j++)
        {
            mtx[i][j] = sc.nextInt();
        }
    }
    for (int[] ele : mtx) 
    {
        for (int x : ele) 
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    //     for(int i = 0;i<3;i++)
    //   {
    //     for(int j = 0;j<3;j++)
    //     {
    //        System.out.print(mtx[i][j]+ " ");
    //     }
    //     System.out.println();
    //   }
    }
}
