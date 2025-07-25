// Write a recursive program which accept number from user and return  smallest digit 
// Input : 87983 
// Output : 3 

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Recursive program which accept number from user and return smallest digit.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
int Min(int iNo) 
{ 
    static int iDigit = 0;
    static int iMin = 9;

    iDigit = iNo % 10;
    
    if(iNo > 0)
    {   
        if(iDigit < iMin)
        {
            iMin = iDigit;
        }

        Min(iNo /10);
    }

    return iMin;
}
int main() 
{ 
    int iValue = 0, iRet = 0; 

    printf("Enter number : "); 
    scanf("%d",&iValue); 

    iRet = Min(iValue); 

    printf("%d",iRet); 

    return 0; 
} 