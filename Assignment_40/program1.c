// Write a recursive program which display below pattern.  
 // Output :  * * * * * 
  
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display() 
{ 
    static int i = 0;

    if(i < 5)
    {
         printf("*\t");
         i++;
         Display();
    }

} 
int main() 
{ 
    Display(); 
    return 0; 
} 
