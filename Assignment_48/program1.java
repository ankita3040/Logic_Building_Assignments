// Write Java program which accept String from user and display below pattern. 
/*
    Input : Hello
    Output : H e l l o
             H e l l o
             H e l l o
             H e l l o
             H e l l o
  
 */

import java.util.Scanner;

class Pattern 
{ 
    public void Pattern(String str) 
    { 
        char[] strnew = str.toCharArray();

        int i = 0, j = 0;
        for(i = 0; i < strnew.length; i++)
        {
            for(j = 0; j < strnew.length; j++)
            {
                System.out.print(strnew[j] +"\t");
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
