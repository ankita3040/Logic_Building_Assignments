
#include<stdio.h>

 void PrintEven(int iNo)
 {
    if(iNo <= 0)
    {
        return;
    }
     
    int iCnt = 0;

    for(iCnt = 2; iCnt <= (iNo * 2); iCnt =iCnt + 2)
    {
        if(iCnt % 2 == 0)
        {
            printf("%d\n",iCnt);
        }
    }
 }