//Write a program which accept matrix and check whether the matrix is Sparse matrix or not. 
// Sparse matrix is a matrix with the majority of its elements equal to zero.
/* 
Input : 
        1 0 3 0
        0 6 0 0
        0 0 1 0
        9 0 0 9

 Output : True 
 */

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Accept matrix and check whether the matrix is Sparse matrix or not.
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


    public boolean ChkSparse() 
    { 
          
          int i = 0, j = 0, iCount = 0, Total;
          Total = Arr.length * Arr[i].length;
          
          for(i = 0; i < Arr.length  ; i++)
          { 
                  for(j = 0 ; j < Arr[i].length; j++)
                  {
                        if(Arr[i][j] == 0)
                        {
                                iCount++;
                        }
                  }

               
            }

        if(iCount > Total /2)
        {
                return true;
        }
        else
        {
                return false;
        }
           
    }
 
   
}
     



class program5
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
        boolean bRet = mobj.ChkSparse();


        if(bRet == true)
        {
            System.out.println("True It is a Sparse Matrix");
        }
        else
        {
            System.out.println("Flase It is not a Sparse Matrix");
        }

        

    }
}

