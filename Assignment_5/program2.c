// write  a program which accept number from user and print numbers till that  number 
/*
    INPUT  : 8
    OUTPUT : 1 2 3 4 5 6 7 8
*/
//Time Complexity = O(N)

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%d  ",iCnt);
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}