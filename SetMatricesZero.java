package SkillsPw.TwoDimensionalArray;

import java.util.Scanner;

public class SetMatricesZero 
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
    int[][] mtx2 = new int[m][n];
    int a = 0;
    int b = 0;
    // Method 1
    for( i = 0;i<m;i++)
    {
      for( j = 0;j<n;j++)
      {
        mtx2[i][j] = mtx[i][j];
      }
    }
    for( i = 0;i<m;i++)
    {
      for( j = 0;j<n;j++)
      {
          if (mtx2[i][j] == 0) 
          {
            for(int k = 0;k<n;k++)
            {
                mtx[i][k] = 0;
            }
            for(int l = 0;l<m;l++)
            {
                mtx[l][j] = 0;
            }
          }
      }
    }
      print(mtx);
      System.out.println();
      // Method 2
   boolean[] rows = new boolean[m];
   boolean[] colm = new boolean[n];
    for(  i = 0;i<m;i++)
{
  for(  j = 0;j<n;j++)
   {
      if (mtx[i][j] == 0) 
      {
        rows[i] = true;
        colm[j] = true;
      }
    }
  } 
    for(  i = 0;i<m;i++)
    {
        if(rows[i] == true) 
        {
         for( j = 0;j<n;j++) 
         {
              mtx[i][j] = 0;
            }
        }
    } 
     for(  j = 0;j<n;j++) 
     {
         if(colm[j] == true) 
         {
           for( i = 0;i<m;i++) 
           {
                mtx[i][j] = 0;
            }
        }
    } 
    print(mtx);
    System.out.println();
    // Method 3 
    boolean rows = false;
    boolean colm = false;
     for(  i = 0;i<m;i++)
 {
     if(mtx[i][0] == 0)
     {
         colm = true;
         break;
     }
   } 
   for(  j = 0;j<n;j++)
 {
     if(mtx[0][j] == 0)
     {
         rows = true;
         break;
     }
   } 

     for(  i = 1;i<m;i++)
     {
          for( j = 1;j<n;j++) 
          {
             if(mtx[i][j] == 0)
             {
                 mtx[i][0] = 0;
                 mtx[0][j] = 0;
                  }
             }
         }

      for(  j = 1;j<n;j++) 
      {
          if(mtx[0][j] == 0) 
          {
            for( i = 1;i<m;i++) 
            {
                 mtx[i][j] = 0;
             }
         }
     } 
     for(  i = 1;i<m;i++) 
     {
          if(mtx[i][0] == 0) 
          {
            for( j = 1;j<n;j++) 
             {
                 mtx[i][j] = 0;
             }
         }
     } 
     if(rows == true)
     {
         for( j=0;j<n;j++)
         {
             mtx[0][j] = 0;
         }
     }
     if(colm == true)
     {
         for( i=0;i<m;i++)
         {
             mtx[i][0] = 0;
         }
     }
     print(mtx);
  }
    public static void print(int[][] mtx)
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

