// Accept Character from user and check whether it is small case ornot (a-z).

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept Character from user and check whether it is small case ornot (a-z).
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
Input : g
Output: TRUE( small letter)

Input : D
Output: FALSE(not small letter)
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int bool;

bool ChkSmall(char ch)
{
    bool bFlag = FALSE;

    if((ch >= 'a') && (ch <= 'z'))
    {
        bFlag = TRUE;
    }

    return bFlag;
}
int main()
{
    char cValue = '\0';
    bool bRet = FALSE;

    printf("Enter character \n");
    scanf("%c",&cValue);

    bRet = ChkSmall(cValue);
    
    if(bRet == TRUE)
    {
        printf("%c is small letter \n",cValue);
    }
    else
    {
        printf("character is not small letter \n");
    }

    return 0;
}