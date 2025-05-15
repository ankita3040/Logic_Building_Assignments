// Write a program to find factorial of given number 

/*
    INPUT : 5
    OUTPUT : 120

    INPUT : -5
    OUTPUT : 120

    INPUT : 4
    OUTPUT : 24 
*/
//Time Complexity = O(N)

#include<stdio.h>
int Factorial(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    int iCnt = 0;
    int iFact = 1;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
   
        iFact = iFact * iCnt;
        
    }

    return iFact;

}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);

    iRet =Factorial(iValue);

    printf("%d\n",iRet);

    return 0;

}