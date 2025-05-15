// write a program which accpet number from user and return summation of all its non factor .
/*
    INPUT : 12
    OUTPUT : 50

    INPUT : 10
    OUTPUT : 37
*/
//Time Complexity = O(N)

#include<stdio.h>

int NonFact(int iNo)
{

    int iCnt = 0;
    int iSum = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt =1; iCnt < iNo ; iCnt++)
    {
        if ((iNo % iCnt ) != 0)
        {
            iSum = iSum + iCnt;
            
        }
    }

    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);

    iRet = NonFact(iValue);

    printf("%d\n",iRet);

    return 0;
}