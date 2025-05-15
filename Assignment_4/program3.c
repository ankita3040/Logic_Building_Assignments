//write a program which accpet number from user and display all its non factors 
/*
    INPUT : 12
    OUTPUT: 5 7 8 9 10 11

    INPUT : 12 
    OUTPUT : 2 3 4 5 6 7 8 9 10 11 12
*/

//Time Complexity = O(N)

#include<stdio.h>

void NonFact(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt ) != 0)
        {
            printf("%d\n",iCnt);
         }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    NonFact(iValue);

    return 0;


}