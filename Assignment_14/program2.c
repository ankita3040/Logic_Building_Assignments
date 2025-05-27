// Accept number of rows and number of columns from user and display below pattern.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept number of rows and number of columns from user and display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  22/05/2025
///////////////////////////////////////////////////////////////////////////////

/* Input : iRow = 4   iCol = 5
   Output : 2 4 6 8 10
            1 3 5 7 9
            2 4 6 8 10
            1 3 5 7 9
*/

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0, k = 0 ;

    for(i = 1; i <= iRow ; i++)
    {
        if((i % 2) == 0)
        {
            k = 1;
        }
        else
        {
            k = 2;
        }
        for(j = 1; j <= iCol && k <= 10; j++, k += 2)
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