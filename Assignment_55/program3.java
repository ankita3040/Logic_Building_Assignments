// Write Java program which accept array of characters from user and accept one character.
// Return occurrence of that character without considering case. 
/*
    Input :  b N j B R b A i G i     b
    Output : 3
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept array of characters from user and return count vowels       
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public int CountOccurance(char arr[],char ch) 
        { 
            int i = 0, iCount = 0;
            for(i = 0; i < arr.length; i++ )
            {
                
                if (arr[i] == ch || arr[i] == ch + ('a' - 'A') || arr[i] == ch - ('a' -'A'))
                {
                    iCount++;
                }
            }
            return iCount;
            
        }
} 
public class program3
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter size of array");
    int iSize = sobj.nextInt();


    char[] Arr = new char[iSize];
    System.out.println("Enter charcater : ");

    int i = 0;
    
    for(i = 0; i < Arr.length; i++)
    { 
       Arr[i] = sobj.next().charAt(0);
    }

    System.out.println("Enter character to search its occurance ");
    char ch = sobj.next().charAt(0);
    MyArray mobj = new MyArray();
    int iRet =  mobj.CountOccurance(Arr,ch);

    System.out.println("Number of time "+ ch +" occur in array is " + iRet);
 
}
}
