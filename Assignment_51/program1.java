// Write a java program which accept matrix from user and swap the contents of each consecutive rows.

/*
 
    Input  Matrix is :
        1 4 7 5
        8 9 2 4
        1 5 6 3
        4 7 5 6

    Updated Matrix is :
        8 9 2 4
        1 4 7 5
        4 7 5 6
        1 5 6 3
  
 */

  
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept matrix from user and swap the contents of each consecutive rows.          
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

    public void  SwapMatrixByRow()
    {
        int i = 0, j = 0, temp = 0;

        
        for(i = 0; i < Arr.length -1; i += 2)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                temp = Arr[i][j];
                Arr[i][j] =  Arr[i + 1][j];
                Arr[i + 1][j] = temp;
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

class program1
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
        pobj.SwapMatrixByRow();
        pobj.Display();
        

    }
}