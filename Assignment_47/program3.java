// Write Java program which accept number of rows and number of columns from user and display below pattern. 

/*  
    Input   :  iRow = 3      iCol = 5
    Output  : 
              5 4 3 2 1
              5 4 3 2 1
              5 4 3 2 1

*/

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept number of rows and number of columns from user
//                and display below pattern
// Autor       :  Ankita Anil Patil
// Date        :  19/08/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern 
{ 
    int Arr[][];
   
    public Pattern(int iRow, int iCol) 
    { 
       Arr = new int [iRow][iCol];     
    } 

    public void  DisplayPattern()
    {
        int i = 0, j = 0;
       
        for(i = 0; i < Arr.length; i++)
        {
            for(j = Arr[0].length; j > 0; j--)
            {
                System.out.print(j +"\t");
            }

            System.out.println();
        }

    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern(iValue1,iValue2);

        pobj.DisplayPattern();

    }
}
