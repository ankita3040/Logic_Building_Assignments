// Accept character from user and display its ASCII value in decimal, octal and hexadecimal format.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept character from user and display its ASCII value in decimal, octal and hexadecimal format.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input :  A
    Output : Decimal 65
             Octal   0101
             Hexadecimal 0x41
*/



#include<stdio.h>

void Display(char ch)
{
    

        printf("Decimal : %d\n",ch);
        printf("Octal : 0%o\n",ch);
        printf("Hexadecimal : X%X\n",ch);
        
    
}

int main()
{
    char cValue = '\0';

    printf("Enter character \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}