//  Write a recursive program which accept string from user and count number of characters.
// Input : Hello 
// Output : 5 

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Recursive program which accept string from user and count number of charcters
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////


#include<stdio.h>
int Strlen(char *str) 
{
    static int iCount = 0;

    if(*str != '\0')
    {
        iCount++;
        Strlen(++str);
    }

    return iCount;
} 
int main() 
{ 
    int iRet = 0; 
    char arr[20]; 

    printf("Enter string : "); 
    scanf("%s",arr); 

    iRet = Strlen(arr); 

    printf("%d",iRet); 

    return 0; 
}