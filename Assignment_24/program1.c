// Write a program which accept string from user and count number of capital characters.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept string from user and count number of capital characters
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : "Marvellous Multi OS"
    Output : 4
*/

#include<stdio.h>

int CountCapital(char *str)
{
    int iCount = 0;

    if(str == NULL)
    {
        printf("Invalid input ");
        return -1;

    }

    while(*str != '\0')
    {
        if((*str >= 'A') && (*str <= 'Z'))
        {
            iCount++;
        }
        str++;

    }

    return iCount;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string\n");
    scanf("%[^'\n]s",arr);

    iRet = CountCapital(arr);

    printf("%d\n",iRet);
    return 0;
}


