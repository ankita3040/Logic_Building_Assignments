// . Write Java program to Transpose a Matrix. 

/* 
   Input Matrix:
            1 2
            3 4
            5 6

   Output Matrix:
            1 3 5
            2 4 6
  

*/


////////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Accept 2D array matrix convert to transpose matrix 
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Matrix 
{
    public void TransposeMatrix(int[][] arr) 
    {
        int transArr[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                transArr[j][i] = arr[i][j];
            }
        }

        System.out.println("After transpose Matrix:");

        for (int i = 0; i < transArr.length; i++) 
        {
            for (int j = 0; j < transArr[0].length; j++) 
            {
                System.out.print(transArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

public class program5 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int row = sc.nextInt();

        System.out.print("Input number of columns: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                System.out.print("Element [" + (i+1) + "," + (j+1) + "] ? ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        Matrix mobj = new Matrix();
        mobj.TransposeMatrix(arr);
    }
}
