// Accept division of student from user and depends on the division display exam timing. 
// There are 4 divisions in school as A,B,C,D. 
// Exam of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
//(Application should be case insensitive)

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept division of student from user and depends on the division display exam timing
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
Input : C
Output: Your exam at 9:20 AM

Input : D
Output: Your exam at 10:30 AM
*/

#include<stdio.h>

void DisplaySchedule(char chDiv)
{
    if(chDiv == 'A')
    {
        printf("Your exam at 7 AM\n");
    }

    else if(chDiv == 'B')
    {
        printf("Your exam at 8:30 AM\n");
    }

    else if(chDiv == 'C')
    {
        printf("Your exam at 9:20 AM\n");
    }

    else if(chDiv == 'D')
    {
        printf("Your exam at 10:30 AM\n");
    }

    else
    {
        printf("please Enter valid Division\n");
    }


}
int main()
{
    char cValue = '\0';

    printf("Enter Division  \n");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}