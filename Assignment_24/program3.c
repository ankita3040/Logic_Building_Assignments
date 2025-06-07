// Write a program which accept string from user and display it in reverse order

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept string from user and display it in reverse order
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : "Marvellous"
    Output : suollevraM
*/

#include<stdio.h>

void Reverse(char *str)
{
    
    if(str == NULL)
    {
        printf("Invalid input ");
        return -1;
    }

    int iCount = 0, iCnt = 0;

    while(*str != '\0')
    {
        iCount++;
        str++;
    }
    str--;


    for(iCnt = iCount; iCnt > 0; iCnt--, str--)
    {
        printf("%c",*str);
    }

    printf("\n");

}

int main()
{
    char arr[20];

    printf("Enter string\n");
    scanf("%[^'\n]s",arr);

    Reverse(arr);

    return 0;
}


