//Accept number from user and check whether number is even or odd;

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept number from user and check whether number is even or odd 
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////



#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL ;
 BOOL CHEven(int iNo)
 {
     if(iNo % 2 == 0)
     {
      return TRUE;
     }
     else
     {
      return FALSE;
     }
 }

 int main()
 {
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number ");
    scanf("%d",&iValue);

    bRet = CHEven(iValue);

    if(bRet == TRUE )
      {
         printf("Number is EVEN\n");
      }
    else
    {
         printf("NUmber is ODD \n");
    }
    return 0;
 }