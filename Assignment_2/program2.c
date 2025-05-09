//Accept one number from user and print that number of * on screen


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept one number from user and print that number of * on screen
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////



#include<stdio.h>

void Display(int iNo)
{
    //write Updater
    int iCnt = 0;
    while(iNo > iCnt)
    {
        printf("*\n");
        iNo--;

    }
}

int main()
{
    int iValue = 0;
    printf("Enter number ");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}