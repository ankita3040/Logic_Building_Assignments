// Write a program which accept matrix from user and return addition of diagonal elements.
/* 
Input :
     3 2 5 9
     4 3 2 2
     8 4 1 5
     3 9 7 5

Output :  12
*/
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept matrix from user and return addition of diagonal elements..
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


    public int AddDiagonal() 
    { 
    
        int i = 0, j = 0, iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
  
            for(j = 0; j < Arr[i].length; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            
            }
        }
       
        return iSum;   
    
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
        
        int iRet = 0;
        iRet = mobj.AddDiagonal();

        System.out.println("Addition of elements which are in diagonal is : "+iRet);

    }
}