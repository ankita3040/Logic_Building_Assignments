// Accept Character from user and check whether it is digit or not(0-9).

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept Character from user and check whether it is digit or not(0-9).
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
Input : 7
Output: TRUE(You are  entered digit)

Input : d
Output: FALSE(You are not entered digit)
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int bool;

bool ChkDigit(char ch)
{
    bool bFlag = FALSE;

    if((ch >= '0') && (ch <= '9'))
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

    bRet = ChkDigit(cValue);
    
    if(bRet == TRUE)
    {
        printf("You are  entered digit\n");
    }
    else
    {
        printf("You are not entered digit\n ");
    }

    return 0;
}