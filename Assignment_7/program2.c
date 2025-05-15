// Accept amount is US dollor and return its  corresponding value in indian currency consider 1$ as 70 rupees.

/*
    INPUT : 10
    OUTPUT: 700

    INPUT : 3
    OUTPUT : 210

    INPUT : 1200
    OUTPUT: 84000
*/

#include<stdio.h>

int DollarTOINR(int iNo)
{
    iNo = iNo * 70;

    return iNo;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number of USD :");
    scanf("%d",&iValue);

    iRet = DollarTOINR(iValue);

    printf("Value in INR is %d \n",iRet);

    return 0;
}