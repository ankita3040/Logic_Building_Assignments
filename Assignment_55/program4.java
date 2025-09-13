//  Write Java program which accept array of characters from user and 
// return difference between frequency of capital and frequency of small characters. 
/*
    Input :  b N j B R b A i G i     
    Output : (5 - 5) = 0
 */

////////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.java
// Description :  Accept array of characters from user and  count vowels
//                return difference between frequency of capital and frequency of small characters.       
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////


import java.util.*;

class MyArray 
{ 
        public int Diffrence(char arr[]) 
        { 
            int i = 0, iCountSmall = 0, iCountCap = 0;
            for(i = 0; i < arr.length; i++ )
            {
                
                if (arr[i] >= 'a' && arr[i] <= 'z')
                {
                    
                    iCountSmall++;
                    
                }
                
                else if (arr[i] >= 'A' && arr[i] <= 'Z')
                {

                    iCountCap++;
                    
                }
            }
            return (iCountCap - iCountSmall);
            
        }
} 
public class program4
    
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
    int iRet =  mobj.Diffrence(Arr);

    System.out.println("Difference is : " + iRet);
 
}
}
