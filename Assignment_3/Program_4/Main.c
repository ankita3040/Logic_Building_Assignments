// Accept one character from user  and convert case of that character

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept one character from user  and convert case of that character
// Autor       :  Ankita Anil Patil
// Date        :  09/05/2025
///////////////////////////////////////////////////////////////////////////////


// I/P : A    d
// O/P : a    D  

#include<stdio.h>

int main()
{
    char cValue = '\0';
    printf("Enter Character\n");
    scanf("%c",&cValue);
   

    DisplayConvert(cValue);
    

    return 0;
}
