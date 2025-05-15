/*
Write a program which accept area in square feet and convert it into square
meter. (1 square feet = 0.92903 Square meter)

INPUT : 5
OUTPUT : 0.464515

INPUT : 7
OUTPUT : 0.650321
*/


#include<stdio.h>

double SquareMeter(int iNo)
{
    double dSquaMeter = 0.0;

    dSquaMeter = (iNo * 0.092903);

    return dSquaMeter;
}


int main()
{

    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("%lf",dRet);

    return 0;

}