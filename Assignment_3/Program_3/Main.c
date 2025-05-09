
//write a program which accpet  number from user and print  factors of that number 

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accpet  number from user and print  factors of that number 
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////

// INPUT : 24
// OUTPUT : 1 2 4 6 8 12 


#include<stdio.h>
int main()
{
    int iValue = 0;
    printf("Enter number \n");
    scanf("%d",&iValue);
    
    DisplayFactor(iValue);

    return 0;
}