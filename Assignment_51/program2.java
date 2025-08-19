// Write a java program which accept matrix from user and swap the contents of each consecutive columns. 

/*
     Input Matrix is :
        1 2 5 4
        7 8 1 2
        6 9 5 4
        3 4 8 5

     Updated  Matrix is :
        2 1 4 5
        8 7 2 1
        9 6 4 5
        4 3 5 8
 */

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept matrix from user and swap the contents of each consecutive columns.          
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

    public void  SwapMatrixByCol()
    {
        int i = 0, j = 0, temp = 0;

        
        for(i = 0; i < Arr.length ; i++)
        {
           for(j = 0; j < Arr[0].length -1; j += 2)
           {
                temp = Arr[i][j];
                Arr[i][j] =  Arr[i][j + 1];
                Arr[i][j + 1] = temp;
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

class program2
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
        pobj.SwapMatrixByCol();
        pobj.Display();
        

    }
}