// write a program which accpet one number from user and print that number of even numbers on screen

///////////////////////////////////////////////////////////////////////////////
// File Name   :  Main.c
// Description :  Accept one number from user and print that number of even numbers on screen 
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////


///Input : 7
//Output : 2 4 6 8 10 12 14


#include<stdio.h>
int main ()
{
    int iValue = 0;
    printf("Enter number \n");
    scanf("%d",&iValue);

    PrintEven(iValue);
    return 0;
}