// Write a program which 2 strings from user and concat second string after first string.
//  (Implement strcat() function).


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept string from user and  concat second string after first string.
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : "Marvellous Infosystems"
             "Logic Building"

    Output : "Marvellous INfosystem Logic Building"
*/

#include<stdio.h>

void StrCatX(char *src, char * dest)
{

    if(src ==NULL)
    {
        printf("Invalid input ");
        return -1;
    }
    while(*src != '\0')
    {
        src++;
    }
    while(*dest != '\0')
    {
        *src = *dest;
         src++;
         dest++;
    }
    *src = '\0';
}

int main()
{
    char arr[50] = "Marvellous Infosystems";
    char brr[30] = " Logic Building";

    StrCatX(arr,brr);

    printf("%s\n",arr);
    // Marvellous Infosystems Logic Building
    return 0;
}