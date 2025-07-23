// Write a recursive program which display below pattern.  
 // Output :  A B C D E F

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

  

#include<stdio.h>

void Display() 
{ 
    static char ch = 'A';

    if((ch >= 'A') && (ch <= 'F'))
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
