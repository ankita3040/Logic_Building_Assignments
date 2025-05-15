// Write a program which accept number from user and count frequency of such a digits which are less than 6.
/*
    Input : 1018
    Output :3

    Input : 9440
    Output :3


*/
//Time Complexity = O(N)

#include<stdio.h>

int Count(int iNo)
{
    int iDigit = 0, iCnt = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < 6 )
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
    scanf("%d\n",&iValue);


    iRet = Count(iValue);

    printf("%d",iRet);
    
    return 0;

}