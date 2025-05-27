// Accept number of rows and number of columns from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept number of rows and number of columns from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

/* Input : iRow = 4   iCol = 4
   Output : 1 2 3 4
            2 3 4 5
            3 4 5 6
            4 5 6 7

*/


#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0, k = 0;
   

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1, k = i; j <= iCol; j++, k++)
        {
            printf("%d\t",k);
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