//Write a recursive program which accept number from user and return its reverse number
// Input :  523
// Output :  325  

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Recursive program which accept number from user and return its reverse number.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
int Reverse(int iNo) 
{
    static int iRev = 0;
    static int iDigit = 0;
    
    if(iNo > 0)
    {
        iDigit = iNo % 10;
        iRev = iRev * 10 + iDigit;
        Reverse(iNo / 10);
    }
    return iRev;
}
int main() 
{ 
    int iValue = 0, iRet = 0; 

    printf("Enter number : "); 
    scanf("%d",&iValue); 

    iRet = Reverse(iValue); 

    printf("%d",iRet); 

    return 0; 
}