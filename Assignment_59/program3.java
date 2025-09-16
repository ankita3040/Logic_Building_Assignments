//  Write java program to print below pattern. 
/*
    * * * * * 
     * * * * 
      * * * 
       * * 
        *  
 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept row from user and print above pattern
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*; 

class Pattern 
{ 

    public void PrintPattern(int rows)
    {
        int i = 0, j = 0;

        for(i = 0; i < rows; i++)
        {
            for(j = 0 ; j < i ;j++ )
            {
                System.out.print(" ");
            }
            for( ; j < rows; j++)
            {
                System.out.print("* ");
            }

            
            System.out.println();
        }


    }
} 
class program3
{
    public static void main(String args[]) 
    { 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter row : ");
        int iRow = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.PrintPattern(iRow);

    } 
    
}
