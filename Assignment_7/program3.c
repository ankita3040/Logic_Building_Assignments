// Write a program to find even factorial of given number 
/*
    INPUT : 5
    OUTPUT :8 (4*2)

    INPUT : -5
    OUTPUT :8 (4*2)

    INPUT : 10
    OUTPUT:3840 (10*8*6*4*2)

*/
//Time Complexity = O(N)

#include<stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int  iFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2) == 0)
        {
            iFact = iFact * iCnt;
        }

    }

    return iFact;

}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even Factorial of number is %d \n",iRet );


    return 0;
}