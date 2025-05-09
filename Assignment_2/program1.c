//Accept one number from user and print that number of * on screen

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept one number from user and print that number of * on screen 
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////



#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    //writer Updater
    while(iCnt < iNo)
    {
        printf("*\n");
        iCnt ++;
    }
}

int main()
{
    int iValue = 0;
    
    printf("Enter number");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}