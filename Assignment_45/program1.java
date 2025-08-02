//Write a program which accept matrix from user and display transpose of the matrix. 
// The transpose of a given matrix is formed by interchanging the rows and columns of a matrix. 
/* 
Input :

        3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output :
        3 4 8 3
        2 3 4 9
        5 2 1 7
        9 2 5 5
*/

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept matrix from user and display transpose of the matrix.
// Autor       :  Ankita Anil Patil
// Date        :  2/08/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;
class Matrix
{
    private  int Arr[][];

    public Matrix(int A, int B)
    {
        Arr = new int[A][B];
        
    }
    
    public void Accept()
    {
        System.out.println("Please enter elements of matrix ");
      
        Scanner sobj = new Scanner(System.in);

        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0 ; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
            
            System.out.println();
        }
     
    }

     public void Display()
     {
         System.out.println("Elemnets of Matrix are : ");
         int i = 0, j = 0;

         for(i = 0; i < Arr.length; i++)
          {
               for(j = 0 ; j < Arr[i].length; j++)
               {
                     System.out.print(Arr[i][j]+"\t");
               }
               System.out.println();
            
          }
     }


    public void Transpose() 
    { 
            
          int i = 0, j = 0;
          int TempArr[][] = new int[Arr.length][Arr[0].length];

          for(i = 0; i < Arr.length  ; i++)
          { 
               for(j = 0 ; j < Arr[i].length; j++)
               {
                   
                    TempArr[j][i] = Arr[i][j];
 
               }
          }

          System.out.println("Elemnets of Matrix after transpose are  : ");  
          for(i = 0; i < TempArr.length; i++)
          {
               for(j = 0 ; j < TempArr[i].length; j++)
               {
                     System.out.print(TempArr[i][j]+"\t");
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

        System.out.println("Enter Number of rows ");
        int iRow = sobj.nextInt();

        System.out.println("Enter Number of columns ");
        int iCol = sobj .nextInt();

        Matrix mobj = new Matrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
        mobj.Transpose();
       

        

    }
}