// Write a program which accept two numbers from user and display position of common ON bits from that two numbers.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  accept one number and position from user aand display position of common ON bits from that two numbers.
// Autor       :  Ankita Anil Patil
// Date        :  18/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
    Input : 10 15 (1010) (1111)
    Output:  2 4

*/

#include <stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{   
    UINT iMask1 = 1;
    UINT iMask2 = 1;
    UINT iResult1 = 0;
    UINT iResult2 = 0;
    int iCnt = 0;

    for(iCnt = 1; iCnt <= 32; iCnt++)
    {
        iResult1 = iNo1 & iMask1;
        iResult2 = iNo2 & iMask2;

        if((iResult1 == iResult2) && (iResult1 != 0))
        {
            printf("%d\n",iCnt);
        }

        iMask1 = iMask1 << 1;
        iMask2 = iMask2 << 1;
    }  
}

int main()
{
    UINT iValue1 = 0, iValue2 = 0;

    printf("Enter number 1  \n");
    scanf("%u",&iValue1);

    printf("Enter number 2 \n");
    scanf("%u",&iValue2);

    CommonBits(iValue1, iValue2);

    return 0;
}