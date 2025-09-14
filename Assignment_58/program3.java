//Java program to input a string from user and reverse each word of given string  
/*
    Input : ABC XY C
    Output : CBA YX C 
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept string from user and reverse each word of given string 
// Autor       :  Ankita Anil Patil
// Date        :  14/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; 
class ReverseEachWord  
{       
//ABC XY PQ 
    public  static String  reverseWord(String str) 
    { 
        str = str.trim(); 

        str = str.replaceAll("\\s+"," "); 

        String tokens[] = str.split(" ");
        
        StringBuilder sb = null;

        StringBuilder newstr = new StringBuilder();
        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            newstr.append((sb.reverse()).append(" "));
            
        }

        return new String(newstr);


    } 
}
class program3
{
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enput String : "); 
        String str = sc.nextLine(); 

        System.out.println("Input String : "+str); 
        System.out.println("String with Reverese Word : "+ReverseEachWord.reverseWord(str)); 
    } 
}