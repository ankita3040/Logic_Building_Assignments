// Write a java program which accept two array from user and check 
// whether that array and its elements are palindrome or not.  
/*
    Input :  1 252 387783 252 11 
              
    Output : TRUE

    Input :  11 22 99 7 2 11 
              
    Output : FALSE


*/ 

 ///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.java
// Description :  Accept array from userand check whether that array 
//                and its elements are palindrome or not.          
// Autor       :  Ankita Anil Patil
// Date        :  13/09/2025
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MyArray 
{ 
        public boolean ChkPallindrome(int Arr[]) 
        {   
            
            int i = 0, temp = 0, iRev = 0,iDigit = 0;
            boolean bFlag = true;
            
            //232 456654
            for(i = 0; i < Arr.length; i++)
            {   
                temp = Arr[i];

                while(temp != 0)
                {
                    iDigit = temp % 10;
                    iRev = iRev * 10 + iDigit;
                    temp = temp / 10;
                }

                if(iRev != Arr[i])
                {
                    bFlag = false;
                    break;
                }
                iRev = 0;
            }

            return bFlag;
        } 
} 
public class program5
    
{   
    public static void main(String[] args) {
        

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter size of array");
    int iSize = sobj.nextInt();


    int[] Arr = new int[iSize];
    System.out.println("Enter array elements : ");

    int i = 0;
    
    for(i = 0; i < Arr.length; i++)
    { 
       Arr[i] = sobj.nextInt();
    }

    MyArray mobj = new MyArray();
    boolean bRet = mobj.ChkPallindrome(Arr);

    if(bRet == true)
    {
        System.out.println("Array elements are palindrome ");
    }
    else
    {
        System.out.println("Array elements are not palindrome ");
    }
    
}
}
