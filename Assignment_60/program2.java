//  Write Java program to multiply two matrices 
// multiplication  is possible only if the number of columns of A = number of rows of B.
/*
    
 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*; 
class Matrices 
{ 
    public void MultiplyMatrices(int arr1[][], int arr2[][])
    {
        if(arr1[0].length != arr2.length)
        {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        // Size : arr1 -> row arr2 -> col
        int MulMatrix[][] = new int[arr1.length][arr2[0].length];
        int i = 0, j = 0, k = 0;

        // Mutilplication -> arr1 row1 * arr2 col2 , arr1 * arr2 col2
        for( i = 0; i < arr1.length; i++)
        {
            for(j = 0; j < arr2[0].length; j++)
            {
                for(k = 0; k < arr1[0].length; k++)
                {
                    MulMatrix[i][j] += arr1[i][k]  * arr2[k][j];
                }
                
            }
        }

        System.out.println("After mutiplication matrix is : ");
        for( i = 0; i < MulMatrix.length; i++)
        {
            for(j = 0; j <MulMatrix[0] .length; j++)
            {
                System.out.print(MulMatrix[i][j] + " " );
            }
            System.out.println();
        }
    }
   
} 
public class program2
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
            for(j = 0; j < arr1[0].length; j++)
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
            for(j = 0; j < arr2[0].length; j++)
            {
                arr2[i][j] = sobj.nextInt();
            }
            
        }


        System.out.println("Matrix 1 : ");
        for( i = 0; i < arr1.length; i++)
        {
            for(j = 0; j < arr1[0].length; j++)
            {
                System.out.print(arr1[i][j]+ " " );
            }
            System.out.println();
        }

        System.out.println("Matrix 2 : ");
        for( i = 0; i < arr2.length; i++)
        {
            for(j = 0; j < arr2[0].length; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        Matrices mobj = new Matrices();
        mobj.MultiplyMatrices(arr1, arr2);    
    
    } 
    
}
