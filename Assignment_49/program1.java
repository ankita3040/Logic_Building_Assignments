//  Write Java program which accept String from user and display below pattern. 
/*
  Input :  Enter string
            hello
  Output:
            h       *       *       *       *
            h       e       *       *       *
            h       e       l       *       *
            h       e       l       l       *

 */

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept String from user and display below pattern.              
// Autor       :  Ankita Anil Patil
// Date        :  19/08/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern 
{ 
    public void Pattern(String str) 
    { 
        char[] strnew = str.toCharArray();

        int i = 0, j = 0;
        for(i = 1; i < strnew.length; i++)
        {
            for(j = 0; j < strnew.length; j++)
            {
                if(j < i)
                {
                    System.out.print(strnew[j] +"\t");
                }
                else
                {
                    System.out.print("*" +"\t");
                }
                
            }

            System.out.println();
        }

    } 
}

class program1 
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        Pattern pobj = new Pattern();
        pobj.Pattern(str);
        
    }
    
}
