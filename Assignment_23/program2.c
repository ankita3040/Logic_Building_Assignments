// Accept character from user. If character is small display its corresponding capital character,  
// and if it small then display its corresponding capital. In other cases display as it is.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept Character from user and if character small then display its ccorresponding capital character
//                and vice versa
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////



/*
    Input : Q
    OUtput: q

    Input : m
    OUtput: M

    Input : 4
    OUtput: 4

    Input : %
    OUtput: %
*/

#include<stdio.h>

void Display(char ch)
{
    char cCap,cSmall = '\0';

    cCap = 'A';
    cSmall = 'a';

    if((ch >= 'A') && (ch <= 'Z'))
    {
        for(cCap = 'A'; ch <= 'Z'; cCap++)
        {
            
            if(cCap == ch)
            {
                break;
            }
            cSmall++;

        }

        printf("%c\n",cSmall);

        

    }
    else if((ch >= 'a') && (ch <= 'z'))
    {
        for(cSmall = 'a'; ch <= 'z'; cSmall++)
        {
            
            if(cSmall == ch)
            {
                break;
            }
            cCap++;

        }

        printf("%c\n",cCap);
    }

    else
    {
        printf("%c\n",ch);
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