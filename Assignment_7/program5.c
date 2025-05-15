// Write a program which returns diffrence between Even fcatorial and odd factorial of given number 

/*
    INPUT : 5
    OUTPUT : -7 (8-15)

    INPUT : -5
    OUTPUT : -7 (8-15)

    INPUT : 10
    OUTPUT: 2895 (3840-945)
*/
//Time Complexity = O(N)

#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0, iEvenFact = 1,  iOddFact = 1; 
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iCnt % 2 ) == 0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
    }

    return (iEvenFact - iOddFact);

}

int main()
{   
    int iValue = 0;
    int iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial difference  %d \n",iRet );


    return 0;
}