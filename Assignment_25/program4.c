//  Write a program which accept string from user and display only digits from that string.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept string from user and display only digits from that string.
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////


/*
    Input :“marve89llous121”
    Output :89121
    Input :“Demo”
    Output :

*/

#include<stdio.h>

void DisplayDigit(char *str)
{
    while(*str != '\0')
    {
        if((*str >= '0') && (*str <= '9'))
        {
            printf("%c \n",*str);
        
        }
        str++;
    }
   
}

int main()
{
    char arr[20];

    printf("Enter string \n");
    scanf("%[^’\n’]s",arr);

    DisplayDigit(arr);
    

    return 0;
}