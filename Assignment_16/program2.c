// Accept number of rows and number of columns from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept number of rows and number of columns from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

/* Input : iRow = 4   iCol = 4
   Output : * * * *
            * * *
            * *
            *
*/


#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;

    for(i = iRow; i >= 1; i--)
    {
        for(j = 1; j <= i; j++)
        {
            printf("*\t");   
        }

        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows  ");
    scanf("%d",&iValue1);

    printf("Enter number of columns ");
    scanf("%d",&iValue2);


    Pattern(iValue1,iValue2);
    return 0;
}