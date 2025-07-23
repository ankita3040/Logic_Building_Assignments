//  Write a recursive program which accept number from user and return largest digit 
// Input : 87983 
// Output : 9  
 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Recursive program which accept number from user and return largest digits.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
int Max(int iNo) 
{ 
    static int iDigit = 0;
    static int iMax = 0;

    if(iNo > 0)
    {
        iDigit = iNo % 10;
        
        if(iDigit > iMax)
        {
            iMax = iDigit;
        }

        Max(iNo /10);
    }

    return iMax;
}
int main() 
{ 
    int iValue = 0, iRet = 0; 

    printf("Enter number : "); 
    scanf("%d",&iValue); 

    iRet = Max(iValue); 

    printf("%d",iRet); 

    return 0; 
} 