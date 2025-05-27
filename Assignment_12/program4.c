// Accept number from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept number from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

//Input :4
//Output :# 1 * # 2 * # 3 * # 4 *

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    char ch1 = '#', ch2 = '*';

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%c\t%d\t%c\t",ch1,iCnt,ch2);
    }
}

int main()
{
    int iValue = 0;
 
    printf("Enter number of elements ");
    scanf("%d",&iValue);

    Pattern(iValue);
    return 0;
}