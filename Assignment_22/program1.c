// Accept Character from user and check whether it is alphabet or not (A-Z a-z)

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept Character from user and check whether it is alphabet or not (A-Z a-z)
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
Input : F
Output: TRUE(You are  entered character )

Input : &
Output: FALSE(You are not entered character )
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int bool;

bool ChkAlpha(char ch)
{
    bool bFlag = FALSE;
    if((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z'))
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

    bRet = ChkAlpha(cValue);

    if(bRet == TRUE)
    {
        printf("You are  entered character \n");
    }
    else
    {
        printf("You are not entered character\n ");
    }

    return 0;
}