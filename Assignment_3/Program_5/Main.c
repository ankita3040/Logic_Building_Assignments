
//Accept one chacter from user and check  whether that charcter is vowel(a,e,i,o,u) or not 

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  ccept one chacter from user and check  whether that charcter is vowel(a,e,i,o,u) or not
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////

//Input : E OUTPUT : TRUE 
//INPUT : D OUTPUT : FALSE 


#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

int main()
{
    char cValue = '\0';
    BOOL BRet = FALSE;

    printf("Enter charcter \n");
    scanf("%c",&cValue);

    BRet = ChkVowel(cValue);

    if(BRet == TRUE)
    {
        printf("IT IS VOWEL \n");
    }
    else
    {
        printf("IT IS NOT VOWEL \n");
    }
    return 0;
}