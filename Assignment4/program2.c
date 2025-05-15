//Write a program which accept number from user and display its factors in decreasing order 
/*
    INput : 12
    OUTPUT : 6 4 3 2 1
    
    INPUT : 13
    OUTPUT :1 

    INPUT : 10 
    OUTPUT : 5 2 1
*/
//Time Complexity = O(N/2)


#include<stdio.h>

void FactRev(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = iNo/2; iCnt >= 1; iCnt--)
    {
        if((iNo % iCnt) == 0)
        {
            printf("%d\n",iCnt);
        }
    }
    

}

int main()
{
    int iValue = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    FactRev(iValue);

    return 0;
}