
#include<stdio.h>

void DisplayFactor(int iNo)
{
    int i = 0;
    if(iNo <= 0)
    {
        iNo = -iNo;

    }
    
    for(i = 1; i < iNo; i++)
    {
        if(iNo % i == 0)
        {
            printf("%d\n",i);
        }
    }
}