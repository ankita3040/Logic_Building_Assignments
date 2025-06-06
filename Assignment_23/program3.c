// Accept character from user. If it is capital then display all the characters from the input characters till Z.
//  If input character is small then print all the characters in reverse order till a. In other cases return directly.


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept Character from user and if character capital then display all the characters from the input characters till Z
//                if charcter is small then display all all the characters in reverse order till a.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : Q
    OUtput: Q R S T U V W X Y Z

    Input : m
    OUtput: m l k j i h g f e d c b a

    Input : 4
    OUtput: 

    
*/

#include<stdio.h>

void Display(char ch)
{
    if((ch >= 'A') && (ch <= 'Z'))
    {
        while(ch != 'Z')
        {
            ch++;
            printf("%c\n",ch);
        }
       
    }
    else if((ch >= 'a') && (ch <= 'z'))
    {
        while(ch != 'a')
        {
            ch--;
            printf("%c\n",ch);
        }
    }
    else
    {
        printf(" ");
    }
    
}

int main()
{
    char cValue = '\0';

    printf("Enter Character  \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}