//Accept two numbers from user and display first  number in second number of times 

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  DAccept two numbers from user and display first  number in second number of times 
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
i/p : 12 5
o/p : 12 12 12 12 12

i/p : -2 3
o/p : -2 -2 -2 

i/p : 21 -3 
o/p : 21 21 21 

i/p : -2 0
o/p : 
*/

#include<stdio.h>

void Display (int iNo, int iFrequency)
{
    int iCnt = 0;
   

    for(iCnt = 1 ;iCnt <= iFrequency; iCnt++)
    {
        printf("%d\n",iNo);
    }
}

int main()
{
    int iValue = 0;
    int iCount = 0;

    printf("Enter number ");
    scanf("%d",&iValue);

    printf("Enter Frequency ");
    scanf("%d",&iCount);

    Display(iValue,iCount);
    return 0;
    
}