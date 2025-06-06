// Write a program which accept string from user and copy the contents of that string into another string.
//  (Implement strncpy() function)

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept string from user and  copy the contents of that string into another string. 
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : "Marvellous Multi OS"
             10
    Output : "Marvellous 
*/

//Note : If third parameter is greater than the size of source string then copy whole string into destination.

#include<stdio.h>

void StrNCpyX(char *src, char *dest, int iCnt)
{
    if(src ==NULL)
    {
        printf("Invalid input ");
        return -1;
    }

    while((*src != '\0') && (iCnt != 0) )
    {
        *dest= *src;
         src++;
         dest++;
         iCnt--;
    }
    dest = '\0';
    }
int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];
    
    StrNCpyX(arr,brr,10);
    
    printf("Copied string is : %s\n",brr);
   
    return 0;
}