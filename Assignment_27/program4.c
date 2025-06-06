// Write a program which accept string from user and copy small characters of that string into another string.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept string from user and  copy small characters of that string into another string.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : "Marvellous Multi OS"

    Output : "arvellous multi"
*/

#include<stdio.h>

void StrCpySmall(char *src, char *dest)
{
    if(src ==NULL)
    {
        printf("Invalid input ");
        return -1;
    }
    while(*src != '\0')
    {
        if((*src >= 'a') && (*src <= 'z'))
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
    char arr[30] = "Marvellous multi OS";
    char brr[30];

    StrCpySmall(arr,brr);

    printf("Small letters are : %s \n",brr);
    // arvellousmulti
    return 0;
}