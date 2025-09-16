// Write java program which Add Two Matrices.

/*
    Matrix 1 :
    1 2
    4 5
    Matrix 2 :
    2 3
    4 1
    After adition matrix is :
    3 5
    8 6
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept two matrix and add both of them and print the result of addition of both matrix
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*; 
class Matrices 
{ 
    public void addMatrices(int arr1[][], int arr2[][])
    {
        int addMatrix[][] = new int[arr1.length][arr1[0].length];
        int i = 0, j = 0;

        for( i = 0; i < arr1.length; i++)
        {
            for(j = 0; j < arr1.length; j++)
            {
                addMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("After adition matrix is : ");
        for( i = 0; i < addMatrix.length; i++)
        {
            for(j = 0; j < addMatrix.length; j++)
            {
                System.out.print(addMatrix[i][j] + " " );
            }
            System.out.println();
        }
    }
   
} 
public class program1 
{
    public static void main(String args[]) 
    { 

        Scanner sobj = new Scanner(System.in);
        
        int i = 0, j = 0;

        System.out.println("Matrix 1: ");
        System.out.println("Enter number of rows : ");
        int iRow1 = sobj.nextInt();

        System.out.println("Enter number of column : ");
        int iCol1 = sobj.nextInt();


        int arr1[][] = new int[iRow1][iCol1];
 
        System.out.println("Enter elements in matrix 1 : ");
        for( i = 0; i < arr1.length; i++)
        {
            for(j = 0; j < arr1.length; j++)
            {
                arr1[i][j] = sobj.nextInt();
            }
            
        }

        
        System.out.println("Matrix 2: ");
        System.out.println("Enter number of rows : ");
        int iRow2 = sobj.nextInt();

        System.out.println("Enter number of column : ");
        int iCol2= sobj.nextInt();

        int arr2[][] = new int[iRow2][iCol2];

        System.out.println("Enter elements in matrix 2 : ");
        for( i = 0; i < arr2.length; i++)
        {
            for(j = 0; j < arr2.length; j++)
            {
                arr2[i][j] = sobj.nextInt();
            }
            
        }


        System.out.println("Matrix 1 : ");
        for( i = 0; i < arr1.length; i++)
        {
            for(j = 0; j < arr1.length; j++)
            {
                System.out.print(arr1[i][j]+ " " );
            }
            System.out.println();
        }

        System.out.println("Matrix 2 : ");
        for( i = 0; i < arr2.length; i++)
        {
            for(j = 0; j < arr2.length; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        Matrices mobj = new Matrices();
        mobj.addMatrices(arr1, arr2);    
    
    } 
    
}
