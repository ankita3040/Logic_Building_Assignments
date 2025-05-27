// Write a program which accept number from user and display its table.
/*
        INPUT : 2 
        OUTPUT : 2 4 6 8 10 12 14 16 18 20

        INPUT : -3 
        OUTPUT: 3 6 9 12 15 18 21 24 27 30

*/
//Time Complexity = O(N)

#include<stdio.h>

void Table(int iNo)
{
    int iCnt = 0;
    int table =  0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= 10; iCnt++)
    {
        table = (iNo * iCnt);
        printf(" %d ",table);
    }
}


int main()
{
    int iValue = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    Table(iValue);
    return 0;
}