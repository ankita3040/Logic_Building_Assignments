//Write a program which accpet N and print first 5 multiple of N .
/*
    INPUT : 4
    OUTPUT : 4 8 12 16 20 
*/
//Time Complexity = O(N)

#include<stdio.h>

 void MultipleDisplay(int iNo)
 {
    int iCnt = 0;
    int iMul = 1;

    for(iCnt = 1; iCnt <=5 ;iCnt++)
    {
        iMul = (iNo * iCnt);
        printf(" %d ",iMul);
    }

 }

 int main()
 {
    int iValue = 0;

    printf("Enter  number :");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);

    return 0;
 }