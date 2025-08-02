// Write a program which accept matrix and one number from user and return frequency of that number. 
/* 
Input :
Number: 9
     3 2 5 9
     4 3 2 2
     8 4 1 5
     3 9 7 5

Output : 2 
*/

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
// Description :  Accept matrix and one number from user and return frequency of that number..
// Autor       :  Ankita Anil Patil
// Date        :  2/08/2025
///////////////////////////////////////////////////////////////////////////////



import java.util.*;
class Matrix
{
    private  int Arr[][];
    private int iNo;

    public Matrix(int A, int B,int C)
    {
        Arr = new int[A][B];
        this.iNo = C;
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
    
        int i = 0, j = 0, iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
              
            for(j = 0; j < Arr[i].length; j++)
            {
               if(Arr[i][j] ==  iNo)
               {
                    iCount++;
               }
                
          
            }
        }
       
        return iCount;   
    
    }

}


class program2
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of rows ");
        int iRow = sobj.nextInt();

        System.out.println("Enter Number of columns ");
        int iCol = sobj .nextInt();

        System.out.println("Enter Number get frequency ");
        int iNo = sobj .nextInt();

        Matrix mobj = new Matrix(iRow,iCol,iNo);
        mobj.Accept();
        
        int iRet = 0;
        iRet = mobj.AddDiagonal();

        System.out.println("Frequency of "+iNo +" is :" +iRet);

    }
}