// Write a program which accept string from user and copy the contents of that string into another string. (Implement strcpy() function)

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept string from user and  copy the contents of that string into another string. 
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : "Marvellous Multi OS"

    Output : "Marvellous Multi OS"  in another string
*/

#include<stdio.h>

void StrCpyX(char *src, char *dest)
{
    if(src ==NULL)
    {
        printf("Invalid input ");
        return -1;
    }
    while(*src != '\0')
    {
        *dest = *src;
        src++;
        dest++;
    }
    *dest ='\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];

    StrCpyX(arr,brr);

    printf("Copied string is : %s\n",brr);

    return 0;
}