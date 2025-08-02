// Write a program which accept matrix and check whether the matrix is identity matrix or not. 
// Identity matrix is a square matrix with 1’s along the diagonal from upper left to lower right and 0’s in all other positions.  
//If it satisfies the structure as explained before then the matrix is called as identity matrix. 
/*
  Input :
        1 0 0 0
        0 1 0 0 
        0 0 1 0
        0 0 0 1
  Output : True
 */

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept matrix and check whether the matrix is identity matrix or not
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


    public boolean ChkIdentity() 
    { 
          
          int i = 0, j = 0;

          boolean bFlag = true;
          for(i = 0; i < Arr.length  ; i++)
          { 
                  for(j = 0 ; j < Arr[i].length; j++)
                  {
                        if(i == j && Arr[i][j] != 1)
                        {
                              
                              bFlag = false;     // // Diagonal must be 1
                        }
                        else if(i != j && Arr[i][j] != 0)
                        {
                              bFlag = false;
                        }
                 
                  }

               
            }

            return bFlag;
    }
 
   
}
     



class program4
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
        boolean bRet = mobj.ChkIdentity();


        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Flase");
        }

        

    }
}