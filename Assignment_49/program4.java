//  Write Java program which accept String from user and display below pattern. 
/*
    Input : Hello
    Output: H e l l o
            H e l l *
            H e l * *
            H e * * *
            H * * * *
            H e * * *
            H e l * *
            H e l l *
            H e l l o
 */

  
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept String from user and display below pattern.              
// Autor       :  Ankita Anil Patil
// Date        :  19/08/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

class Pattern 
{ 
    public void DisplayPattern(String str) 
    { 
        char[] strnew = str.toCharArray();

        int i = 0, j = 0;
 
        for(i = 0; i <strnew.length -1; i++)
        {
            for(j = 0; j < strnew.length; j++)
            {
                if(j < (strnew.length -i))
                {
                    System.out.print(strnew[j] + "\t");
                }
                else
                {
                    System.out.print("*"+"\t");
                }
                
            }

            System.out.println();
        }

        for(i = 0; i <strnew.length ; i++)
        {
            for(j = 0; j < strnew.length; j++)
            {
                if(j <= i)
                {
                    System.out.print(strnew[j] + "\t");
                }
                else
                {
                    System.out.print("*"+"\t");
                }
                
            }

            System.out.println();
        }

    } 
}

class program4
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        Pattern pobj = new Pattern();
        pobj.DisplayPattern(str);
        
    }
    
}