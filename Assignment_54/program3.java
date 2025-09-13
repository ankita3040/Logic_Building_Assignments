// Write java program which accept array of characters from user and count number of capital characters. 
/*
    Input :  b N j B R b A d G G 
    Output : 6
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.java
// Description :  Accept array of characters from user and count number of capital characterss      
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public int ArrayCapital(char arr[]) 
        { 
            int iCount = 0;
            for(char ch : arr)
            {
                if(ch >= 'A' && ch <= 'Z')
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

    MyArray mobj = new MyArray();
    int iRet = mobj.ArrayCapital(Arr);

    System.out.println("Number of capital letter in array are :"+iRet);
    
}
}
