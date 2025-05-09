
//program to print 5 to 1 number on screen

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Print 5 to 1 number on screen
// Autor       :  Ankita Anil Patil
// Date        :  05/05/2025
///////////////////////////////////////////////////////////////////////////////


#include<stdio.h>

void Display()
{
    int j = 0;
    int  i = 5;
    while( j < i)
    {
        printf("%d\n",i);
        i--;
    }
}

int main()
{
    Display();
    return 0;
}