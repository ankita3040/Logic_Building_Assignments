/*
Write a program which accept distance in kilometre and convert it into meter. (1
kilometre = 1000 Meter)

INPUT : 5
OUTPUT : 5000

INPUT : 12
OUTPUT : 12000


*/

#include<stdio.h>

int KMtoMeter(int iNo)
{
    iNo = iNo * 1000;

    return iNo;

}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter distance :");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);

    printf("%d\n",iRet);

    return 0;
}