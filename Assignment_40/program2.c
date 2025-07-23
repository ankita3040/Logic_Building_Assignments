//  Write a recursive program which display below pattern.   
 // Output :  1 2 3 4 5

 
///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

  

#include<stdio.h>

void Display() 
{ 
    static int i = 1;

    if(i <= 5)
    {
         printf("%d\t",i);
         i++;
         Display();
    }

} 
int main() 
{ 
    Display(); 
    return 0; 
} 
