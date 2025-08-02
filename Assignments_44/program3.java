// Write a program which accept matrix and return largest number from both the diagonals 
/* 
Input :

     3 2 5 9
     4 3 2 2
     8 4 1 5
     3 9 7 5

Output : 9
*/


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept matrix and return largest number from both the diagonals 
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


    public int MaxDiagonal() 
    { 
    
          int i = 0, j = 0, iMax1 = 0, iMax2 = 0;

          iMax1 = Arr[i][j];
          for(i = 0; i < Arr.length; i++)
          { 
               for(j = 0; j <Arr[i].length;j++)
               {
                    if(i == j)
                    {
                        if(iMax1 < Arr[i][j])
                        {
                         iMax1 = Arr[i][j];
                        }

                     }
                     
                     else if(j == (Arr.length -1) -i)
                     {
                        if(iMax2 < Arr[i][j])
                        {
                         iMax2 = Arr[i][j];
                        }

                     }
                    
               
               }
          }
   
        if(iMax1 > iMax2)
        {
          return iMax1;
        } 
        else
        {
          return iMax2;
        }  


   
    }

}


class program3
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
        iRet = mobj.MaxDiagonal();

        System.out.println(" largest number from both the diagonals :" +iRet);

    }
}