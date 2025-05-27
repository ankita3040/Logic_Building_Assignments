// Accept number of rows and number of columns from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept number of rows and number of columns from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

/* Input : iRow = 5   iCol = 5
   Output :  1  2  3  4  5
            -1 -2 -3 -4 -5
             1  2  3  4  5
            -1 -2 -3 -4 -5
             1  2  3  4  5

*/



#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0, k = 0;
    

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1, k = -1; j <= iCol && k <= iCol; j++, k--)
        {
            if((i % 2) == 0)
            {
                printf("%d\t",-j);
            }
            else
            {
                printf(" %d\t",j);
            }

            
           
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