// Write a program which accept number from user and count frequency of 4 in it.
/*
    Input : 2395
    Output : 0

    Input : 9442
    Output : 2

*/
//Time Complexity = O(N)

#include<stdio.h>

int CountFour(int iNo)
{
    int iDigit = 0, iCnt =0;

    while (iNo != 0)
    {
        iDigit = iNo % 10;
         if(iDigit == 4)
         {
            iCnt++;
         }

         iNo = iNo / 10;
    }

    return iCnt;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);


    iRet = CountFour(iValue);

    printf("%d\n",iRet);
    
    return 0;
}