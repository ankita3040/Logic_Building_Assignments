// Write a java program which accept matrix from user and trace and normal of given matrix
// Here trace of the matrix is the sum of the elements of the main diagonal 
// i.e the diagonal from the upper left to the lower right of a matrix.
// Normal of the matrix is the square root of the sum of all the elements. 

/*
    Input:
     Matrix is :
        1 2 3
        4 5 6
        7 8 9
    Output:
        Summation of diagonal element is : 15.0
        square root of the sum of all the elements :16.911534525287763
 */

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept matrix from user and trace and normal of given matrix
//                Here trace of the matrix is the sum of the elements of the main diagonal 
//                Normal of the matrix is the square root of the sum of all the elements.        
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

    public double SumOfDoagonal()
    {
        int i = 0, j = 0; 
        double sum  = 0.0;

        for(i = 0; i < Arr.length ; i++)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                if(i == j)
                {
                    sum = sum + Arr[i][j];
                }
           }
        }

        return sum;
    }

    public double NormalOfMatrix()
    {
        int i = 0, j = 0; 
        double square  = 1.0;

        for(i = 0; i < Arr.length ; i++)
        {
           for(j = 0; j < Arr[0].length; j++)
           {
                square = square + (Arr[i][j] * Arr[i][j]);
           }
        }

        double res = Math.sqrt(square);
        return res;
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

class program4
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
        double dRet = pobj.SumOfDoagonal();

        System.out.println("Summation of diagonal element is : "+dRet);

        dRet = pobj.NormalOfMatrix();
        System.out.println("square root of the sum of all the elements :"+dRet);
        
        

    }
}