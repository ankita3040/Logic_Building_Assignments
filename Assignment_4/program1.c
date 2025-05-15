// Write a program which accept number from user and display its maultiplication of factors

/* 
    INPUT : 12
    OUTPUT : 144 (1*2*3*4*5)

    INPUT :  13 
    output : 1 (1)

    INPUT : 10
    OUTPUT : 10 ( 1*2*5)
*/
//Time Complexity = O(N/2)

#include<stdio.h>

int MultFact(int iNo)
{
    int iCnt = 0;
    int iMul = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <=iNo/2; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iMul = iMul * iCnt;
        }
    }

    return iMul;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);

    iRet = MultFact(iValue);

    printf("%d\n",iRet);

    return 0;
}