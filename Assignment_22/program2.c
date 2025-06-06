// Accept Character from user and check whether it is capital or not (A-Z).

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept Character from user and check whether it is capital or not (A-Z).
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
Input : F
Output: TRUE(Capital)

Input : d
Output: FALSE(NOt capital)
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int bool;

bool ChkCapital(char ch)
{
    bool bFlag = FALSE;

    if((ch >= 'A') && (ch <= 'Z'))
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

    bRet = ChkCapital(cValue);
    
    if(bRet == TRUE)
    {
        printf("%c is capital \n",cValue);
    }
    else
    {
        printf("%c is not capital \n",cValue);
    }

    return 0;
}