// Write a program which displays ASCII table. Table contains symbol, Decimal, Hexadecimal and Octal representation of every member from
//0 to 255.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Program which displays ASCII table..
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


#include<stdio.h>

void DisplayASCII()
{
    char ch ='\0';
    int iCnt = 0;
    

    for( iCnt = 0, ch = '\0'; iCnt <= 255; iCnt++, ch++)
    {
        printf(" %d\t0X%X\t0%o\t :%c\n",iCnt,iCnt,iCnt, ch);
    }
}

int main()
{

    DisplayASCII();

    return 0;
}