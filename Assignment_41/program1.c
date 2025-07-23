// Write a recursive program which display below pattern.  
//  Input : 5  
//  Output : * * * * *  


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h> 
void Display(int iNo) 
{ 
    if(iNo > 0)
    {
        printf("*\t");
        Display(--iNo);
    }
} 
int main() 
{ 
    int iValue = 0; 

    printf("Enter number : "); 
    scanf("%d",&iValue); 
    Display(iValue); 

    return 0; 
}