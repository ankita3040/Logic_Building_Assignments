// Write a program which accept string from user and copy capital characters of that string into another string.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept string from user and  copy capital characters of that string into another string.
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : "Marvellous Multi OS"

    Output: "MMOS"
*/

#include<stdio.h>

void StrCpyCap(char *src, char *dest)
{
    if(src ==NULL)
    {
        printf("Invalid input ");
        return -1;
    }
    while(*src != '\0')
    {
        if((*src >= 'A') && (*src <= 'Z'))
        {
            *dest = *src;
             dest ++;
        }
        src++;
    }
    dest = '\0';
}
int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];

    StrCpyCap(arr,brr);

    printf("Capital letters are :%s\n",brr);
    // MMOS
    return 0;
}