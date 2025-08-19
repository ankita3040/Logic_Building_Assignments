//  Write Java program which accept String from user and display below pattern. 
/*
    Input : Hello
    Output: H e l l o
            H e l l *
            H e l * *
            H e * * *
            H * * * *
 */


  
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.java
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
        for(i = strnew.length; i > 0 ; i--)
        {
            for(j = 0; j < strnew.length; j++)
            {
                if( i > j)
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

class program2
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