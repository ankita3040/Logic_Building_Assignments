// Write a program which accept one number from user and range of positions from user. Toggle all bits from that range.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  accept one number from user and range of positions from user. Toggle all bits from that range.
// Autor       :  Ankita Anil Patil
// Date        :  25/07/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : 897  9  13
    Toggle all bits from position 9 to 13 of input number ie 879.

*/
#include<stdio.h>

typedef unsigned int UINT;
UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
    UINT iMask = 0;
    UINT iResult = 0;

    iMask = ((1 << (iEnd - iStart + 1)) - 1) << (iStart - 1);
     
    iResult = iNo ^ iMask;
    
    return iResult;
}

int main()
{
    UINT iValue = 0;
    int iRet = 0;
    int  iLocation1 = 0, iLocation2 = 0;

    printf("Enter number \n");
    scanf("%d",&iValue);

    printf("Enter start position \n");
    scanf("%d",&iLocation1);

    printf("Enter end position \n");
    scanf("%d",&iLocation2);

    iRet = ToggleBitRange(iValue, iLocation1, iLocation2);


    printf("Modified  number is %d\n",iRet);


    return 0;
}
