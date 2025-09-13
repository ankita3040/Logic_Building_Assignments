// Write a java program which accept string and one character from user 
// and remove that character from string. 

/*
    Input : International   a
    Output :Interntionl
             
            
 */


////////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  accept string and one character from user 
//                and remove that character from string.
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.HashMap;
import java.util.Scanner;

class MyArray
{
    public String RemoveCharacter(String str, char ch)
    { 
        str = str.trim();
        char arr[] = str.toCharArray();
        int i = 0, iMax = 0,iCount = 0;
        char newStr[] = new char[arr.length];

        for(i = 0; i < arr.length ; i++)
        {
            if(arr[i] != ch )
            {
                newStr[i] = arr[i];   
            }
        }

        
        return new String(newStr);
    }
}   

class program4
{
    public static void main(String[] args) 
    {

        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter  string ");
        String str= sobj.nextLine();

        System.out.println("Enter charcater that you wnat to remove from string ");
        char ch = sobj.next().charAt(0);

        
        MyArray mobj = new MyArray();
        String newstr = mobj.RemoveCharacter(str,ch);

        System.out.println("New string after removing charcter is : "+ newstr);


    }
}