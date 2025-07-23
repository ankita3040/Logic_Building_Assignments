// Write a recursive program which display below pattern.
 // Output :  5 4 3 2 1

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

  

#include<stdio.h>

void Display() 
{ 
    static int i = 5;

    if(i >= 1)
    {
         printf("%d\t",i);
         i--;
         Display();
    }

} 
int main() 
{ 
    Display(); 
    return 0; 
} 
