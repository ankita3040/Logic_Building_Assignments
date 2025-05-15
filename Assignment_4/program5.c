// Write a program which accept number from user and return difference between summation of its factors and non factors  

/*
    INPUT :  12 
    OUTPUT:  -34 (16 -50)

     INPUT :  10
    OUTPUT:  -29 (8 -37)
*/

//Time Complexity = O(N)


#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iSumFact = 0;
    int iSumNonFact = 0;
    int Diff = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt < iNo; iCnt++ )
    {
        if(iNo % iCnt == 0)
        {
            iSumFact = iSumFact + iCnt;

        }
        else
        {
            iSumNonFact = iSumNonFact + iCnt;
        }
    }

    return (iSumFact - iSumNonFact);

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("Difference between factor and Non factor is :%d \n",iRet);

    return 0;
}