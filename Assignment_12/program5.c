// Accept number from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept number from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

//Input :8
//Output :2 4 6 8 10 12 14 16

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
  
    for(iCnt = 1; iCnt <= (iNo * 2); iCnt++)
    {
        if((iCnt % 2) == 0 )
        {
        printf("%d\t",iCnt);
        }
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