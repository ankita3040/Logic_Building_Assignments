// .Write a program which accept one number from user and count number of ON (1) bits in it without using % and / operator.

/*
    Input : 11
    Output: 3

*/

#include<stdio.h>

typedef unsigned int UINT;

int CountOne(UINT iNo)
{
    
    int iCnt = 0, iCount = 0; 
    UINT iMask = 1;
    UINT iResult = 0;

    for(iCnt = 0; iCnt < 32; iCnt++)
    {
        iResult = iNo & iMask;

        if(iResult != 0)
        {
             iCount++;
        }
        iMask = iMask << 1;
    }
    return iCount;
}

int main()
{
    UINT iValue = 0;
    int  iRet = 0;

    printf("Enter number \n");
    scanf("%u",&iValue);

    iRet = CountOne(iValue);

    printf("Number of 1's are %d\n",iRet);

    return 0;
}