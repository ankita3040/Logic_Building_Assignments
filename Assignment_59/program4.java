//  Write java program to print below pattern. 
/*
      *        * 
     * *      * * 
    * * *    * * * 
   * * * *  * * * * 
  * * * * * * * * * * 
 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
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

        for(i = 0; i <= rows; i++)
        {
            for ( j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }

            for ( j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
           
            for ( j = 1; j < rows - i +1 ; j++) 
            {
                System.out.print("  ");
            }
            
            for ( j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }

            

            System.out.println();
        }

    }
} 
class program4
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

