// Accept Character from user and check whether it is special symbol or not (!, @, #, $, %, ^, &, *).

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept Character from user and check whether it is special symbol or not
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input :%
    Output : TRUE

    Input : d
    Output : FALSE
*/

#include<stdio.h>
#include<stdbool.h>

bool ChkSpecial(char ch)
{
    bool bFlag = false;

    if((ch == '!') || (ch == '@') || (ch == '#') || (ch == '$') || (ch == '%') || (ch == '^') || (ch == '&') || (ch == '*') )
    {
        bFlag = true;
    }

    return bFlag;

}


int main()
{
    char cValue = '\0';
    bool bRet = false;

    printf("Enter Character  \n");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == true)
    {
        printf("It is special character\n");
    }
    else
    {
        printf("It is not a special character\n");
    }

    return 0;
}