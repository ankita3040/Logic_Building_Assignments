// Write a program which accept string from user and count number of small characters.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept string from user and count number of small characters
// Autor       :  Ankita Anil Patil
// Date        :  06/06/2025
///////////////////////////////////////////////////////////////////////////////

/*
    Input : "Marvellous"
    Output : 9
*/

#include<stdio.h>

int CountSamll(char *str)
{
    int iCount = 0;

    if(str == NULL)
    {
        printf("Invalid input ");
        return -1;

    }

    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
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

    iRet = CountSamll(arr);

    printf("%d\n",iRet);
    return 0;
}


