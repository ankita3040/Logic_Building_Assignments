//  Write Java program which accept array of characters from user and count vowels in it. 
/*
    Input :  b N j B R b A i G i  
    Output : 3
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept array of characters from user count vowels
//                with its corresponding small character       
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public int ArrayCountVowels(char arr[]) 
        { 
            int i = 0, iCount = 0;
            for(i = 0; i < arr.length; i++ )
            {
                if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O'|| arr[i] == 'U'
                   || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                {
                   iCount++;
                }
            }
            return iCount;
            
        }
} 
public class program2
    
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

    MyArray mobj = new MyArray();
    int iRet =  mobj.ArrayCountVowels(Arr);

    System.out.println("Number of vowels are : "+ iRet);
 
}
}
