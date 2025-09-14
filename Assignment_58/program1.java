// java program to print pyramid of characters using class
/*
    Input : 5
    Output :          A
                    A B A
                  A B C B A
                A B C D C B A
              A B C D E D C B A 
 */

 
////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  print pyramid of characters using class
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Pattern 
{
    private int num;

    public void setNum(int num)
    {
        this.num = num;
    }

    public int getNum() 
    {
        return this.num;
    }

    public void printAnswer() 
    {
        int i = 0, j = 0;
        for ( i = 0; i < num; i++) {
            
           
            for ( j = 0; j < (num - i); j++) 
            {
                System.out.print("  "); 
            }

           
            for ( j = 0; j <= i; j++)
            {
                System.out.print((char) ('A' + j) + " ");
            }

      
            for ( j = i - 1; j >= 0; j--) 
            {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }

    public void inputNum() 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sobj.nextInt();

        setNum(num);
    }
}

class program1 
{
    public static void main(String[] A) 
    {
        Pattern obj = new Pattern();

        obj.inputNum();
        obj.printAnswer();
    }
}

