// Write a java program which accept matrix from user and return addition of border elements of matrix.
/*
    Input:
        Matrix is :
        1 4 7
        5 8 9
        6 3 2
    Output:
        Summation  of border elements of matrix is : 37.0
 */

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Accept matrix from user and return addition of border elements of matrix        
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

    public double  AdditionOfBorder()
    {
        int i = 0, j = 0;
        double dSum = 0.0;

        
        for(i = 0; i < Arr.length ; i++)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                if(i == 0 || j == 0 || i == Arr.length -1 || j == Arr[0].length -1)
                {
                    dSum = dSum + Arr[i][j];
                }
           }
         
        }
        
       return dSum;

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

class program5
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
        double dRet = pobj.AdditionOfBorder();

        System.out.println("Summation  of border elements of matrix is : "+dRet );
        
        

    }
}