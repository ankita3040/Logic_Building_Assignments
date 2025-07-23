// Write a recursive program which display below pattern.  
 // Output :  a b c d e f

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

  

#include<stdio.h>

void Display() 
{ 
    static char ch = 'a';

    if((ch >= 'a' && (ch <= 'f')))
    {
         printf("%c\t",ch);
         ch++;
         Display();
    }

} 
int main() 
{ 
    Display(); 
    return 0; 
} 
