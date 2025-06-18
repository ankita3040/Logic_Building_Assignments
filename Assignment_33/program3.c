// Write a program which accept one number from user and check whether 9th or 12th bit is on or off.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  accept one number from user and check whether 9th or 12th bit is on or off.
// Autor       :  Ankita Anil Patil
// Date        :  18/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : 257
    Output:  TRUE

*/

#include<stdio.h>

typedef int bool;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

bool ChkBit(UINT iNo)
{
    UINT iMask1  = 1;
    UINT iMask2 = 1;
    UINT iResult = 0;
    UINT iMask = 0;

    iMask1 = iMask1 <<(9-1);
    iMask2 = iMask2 << (12-1);

    iMask = iMask1 | iMask2;

    iResult = iNo & iMask;

    if(iResult == 0)
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }
}

int main()
{
    UINT iValue = 0;
    bool bRet = FALSE;

    printf("Enter numbre \n");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("TRUE : 9th or 12th bit is ON\n");
    }
    else
    {
        printf("FALSE : 9th or 12th bit is OFF\n");
    }

    return 0;
}