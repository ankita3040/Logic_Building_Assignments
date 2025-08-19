// Write a java program which accept matrix from user and return its transpose matrix.
// The transpose of a given matrix is formed by 
// interchanging the rows and columns of a matrix. 

/*
    Input:
        Matrix is :
            7 8 4 5
            1 2 9 6
            3 4 5 8
            1 2 0 3



    Output:
        Updated Matrix is :
            7 1 3 1
            8 2 4 2
            4 9 5 0
            5 6 8 3
    
 */

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept matrix from user and return its transpose matrix.         
// Autor       :  Ankita Anil Patil
// Date        :  19/08/2025
///////////////////////////////////////////////////////////////////////////////
 
import java.util.Scanner;


class Matrix 
{ 
    int Arr[][];
   
    public Matrix(int iRow, int iCol) 
    { 
       Arr = new int [iRow][iCol];     
    } 

    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Values in matrix : ");

        
        for(i = 0; i < Arr.length; i++)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                 Arr[i][j] = sobj.nextInt();
           }
                
           
        }

    }

    public void  TransposeMatrix()
    {
        int i = 0, j = 0, temp = 0;

        int transpose[][] = new int[Arr[0].length][Arr.length];

        for(i = 0; i < Arr.length ; i++)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                transpose[i][j] = Arr[j][i];
           }
        
           System.out.println();   
        }
        
        System.out.println("Updated Matrix is : ");

        
        for(i = 0; i < transpose.length; i++)
        {
           for(j = 0; j < transpose[0].length; j++)
           {
                System.out.print (transpose[i][j] + " "); 
           }
        
           System.out.println();   
        }
   

    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println(" Matrix is : ");

        
        for(i = 0; i < Arr.length; i++)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                System.out.print (Arr[i][j] + " "); 
           }
        
           System.out.println();   
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iValue2 = sobj.nextInt();

        Matrix pobj = new Matrix(iValue1,iValue2);

        pobj.Accept();
        pobj.Display();
        pobj.TransposeMatrix();
        
        

    }
}