// Accept number from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept number from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

//Input :5
//Output : 5 # 4 # 3 # 2 # 1 #

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    char ch = '#';
    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        printf("%d\t%c\t",iCnt,ch);
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