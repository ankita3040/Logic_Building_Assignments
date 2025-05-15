//Write a program which accept number from user and check whether it contains 0 in it or not.
/*
    Input : 2395
    Output : There is no Zero
    
    Input : 1018
    Output :It Contains Zero

    Input : 9000
    Output :It Contains Zero

*/
//Time Complexity = O(N)

#include<stdio.h>

#define TRUE 1
#define FALSE 0 

typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit == 0)
        {
            return TRUE;
        }
        iNo = iNo / 10;
    }

    return FALSE;
}
int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number ");
    scanf("%d",&iValue);

    bRet = ChkZero(iValue);

    if(bRet == TRUE)
    {
        printf("It contains zero \n");
    }
    else
    {
        printf("There is no zero \n");
    }

    return 0;

}