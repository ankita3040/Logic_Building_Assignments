//  Write a recursive program which display below pattern. 
//  Input : 5  
//  Output : 1 2 3 4 5 


///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Recursive program which display below pattern.
// Autor       :  Ankita Anil Patil
// Date        :  23/07/2025
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h> 
void Display(int iNo) 
{ 
    if(iNo >= 1)
    {
        Display(--iNo);
        printf("%d\t",iNo + 1);
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