//  Write a recursive program which display below pattern. 
//  Input : 5  
//  Output : 5 4 3 2 1


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h> 
void Display(int iNo) 
{ 
    if(iNo >= 1)
    {
        printf("%d\t",iNo);
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