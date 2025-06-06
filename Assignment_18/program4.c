// . Accept N numbers from user and display all such elements which are divisible by 3 and 5.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program4.c
// Description :  Accept N numbers from user and display all such elements which are divisible by 3 and 5.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
 Input : N : 6
         Elements : 85 66 3 15 93 88
 Output: 80 (divisible by 3 & 5)
 */

 #include<stdio.h>
 #include<stdlib.h>

 void Display(int Arr[] , int iSize)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return FALSE;
    }
    
    int iCnt = 0;

    printf("Elements which are divible by 3 and 5 are :\n");
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(((Arr[iCnt] % 3) == 0) && (Arr[iCnt] % 5) == 0)
        {
            printf("%d\n",Arr[iCnt]);
        }
    }


 }

 int main()
 {

    int iLength = 0, iCnt = 0;
    int *ptr = NULL;

    printf("Enter number of element :\n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory ");
        return  -1;
    }

    printf("Enter elements of array\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    Display(ptr,iLength);

    free(ptr);
    ptr = NULL;
    
    return 0;
 }