//  Write Java program which accept array of characters from user and 
// replace each capital character with its corresponding small character. 
/*
    Input :  b N j B R b A d G G  
    Output : b n j b r b a d g g
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.java
// Description :  Accept array of characters from user and replace each capital character
//                with its corresponding small character       
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public void ArrayReplace(char arr[]) 
        { 
            int i = 0;
            for(i = 0; i < arr.length; i++ )
            {
                if(arr[i] >= 'A' && arr[i]<= 'Z')
                {
                    arr[i] = (char) (arr[i] + ('a' - 'A'));
                }
            }

            System.out.println("After replace each capital character with its corresponding small character");

            for(char ch : arr)
            {
                System.out.print(ch + "\t");
            }
            
        }
} 
public class program1
    
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
    mobj.ArrayReplace(Arr);
 
}
}
