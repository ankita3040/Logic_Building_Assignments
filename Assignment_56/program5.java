// Write a java program which accept expression from user Check whether the expression is 
// balanced parenthesised or not. (Expression should contains only circular brackets.) 

/*
    Input : (a+(f-g)*2(a-d)) 
    Output :True

    Input :  (a+(f-g)*2(a-d) 
    Output :  False 
             
            
 */


////////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  accept expression from user Check whether the expression is 
//                balanced parenthesised or not (Expression should contains only circular brackets.) 
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.HashMap;
import java.util.Scanner;

class MyArray
{
    public boolean CheckExpression(String str)
    { 
        str = str.trim();
        char arr[] = str.toCharArray();
        int i = 0, iCount = 0;
        

        for(i = 0; i < arr.length ; i++)
        {
            if(arr[i] == '(' || arr[i] == ')')
            {
               iCount++; 
            }
        }

        return (iCount % 2 == 0);
        
        
    }
}   

class program5
{
    public static void main(String[] args) 
    {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter  expression ");
        String str= sobj.nextLine();

        
        MyArray mobj = new MyArray();
        boolean bRet = mobj.CheckExpression(str);

        if(bRet)
        {
            System.out.println("The expression is  balanced parenthesised");
                                            
        }
        else
        {
             System.out.println("The expression is not  balanced parenthesised");
        }
    }
}