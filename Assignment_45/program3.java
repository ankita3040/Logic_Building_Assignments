//  Write a program which accept matrix and reverse the contents of each column. 

/* 
Input :

      3 2 5 9
      4 3 2 2
      8 4 1 9
      3 9 7 5
Output :

      3 9 7 5
      8 4 1 9 
      4 3 2 2
      3 2 5 9 

*/

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept matrix and reverse the contents of each column
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


    public void ReverseCol() 
    { 
          
          int i = 0, j = 0,iStart = 0, iEnd = 0, temp = 0;

          for(i = 0; i < Arr.length  ; i++)
          { 
            for(j = 0 ; j < Arr[i].length; j++)
               {
                  iStart = 0;
                  iEnd = Arr[i].length -1;
                  while (iStart < iEnd) 
                  {
                        temp = Arr[iStart][j];
                        Arr[iStart][j] = Arr[iEnd][j];
                        Arr[iEnd][j] = temp;

                        iEnd--;
                        iStart++;
                 
                  }
            }

               
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
        mobj.Display();
        mobj.ReverseCol();
        mobj.Display();

        

    }
}