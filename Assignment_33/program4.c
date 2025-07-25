// Write a program which accept one number , two positions from user and check whether bit at first or bit at second position is ON or OFF.

/*
    Input : 10 3 7 
    Output : TRUE
*/

#include <stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

bool ChkBit(UINT iNo, int iPos1, int iPos2)
{
    UINT iMask1 = 1;
    UINT iMask2 = 1;
    UINT iMask = 0;
    UINT iResult = 0;

    iMask1 = iMask1 << (iPos1-1);
    iMask2 = iMask2 << (iPos2 -1);

    iMask = iMask1 | iMask2;      
    iResult = iNo & iMask;        

    if (iResult != 0)                 
    {
        return true;
    }
    else
    {
        return false;
    }

    
 
}

int main()
{
    UINT iValue = 0;
    bool bRet = false;
    int  iLocation1 = 0, iLocation2 = 0;

    printf("Enter number \n");
    scanf("%d",&iValue);

    printf("Enter position 1 \n");
    scanf("%d",&iLocation1);

    printf("Enter position 2\n");
    scanf("%d",&iLocation2);

    bRet = ChkBit(iValue, iLocation1, iLocation2);

    if(bRet == true)
    {
        printf("TRUE ");
    }
    else
    {
        printf("FALSE ");
    }

    return 0;
}