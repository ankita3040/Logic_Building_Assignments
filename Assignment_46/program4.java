// Write Java program which accept number of rows and number of columns from user and display below pattern. 
/*  
    Input   :   iRow = 4       iCol = 5 
    Output  : 
                4 4 4 4 4
                3 3 3 3 3
                2 2 2 2 2
                1 1 1 1 1

*/


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
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
       
        for(i = Arr.length; i > 0; i--)
        {
            for(j = 0; j < Arr[0].length; j++)
            {
                System.out.print(i +"\t");
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



        Pattern pobj = new Pattern(iValue1,iValue2);

        pobj.DisplayPattern();


    }
}