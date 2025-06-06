// Accept N numbers from user and return the largest number

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept N numbers from user and return the largest number
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 85 66 3 66 93 88
 Output: 93

 */

#include<stdio.h>
#include<stdlib.h>

 int Maximum(int Arr[], int iSize)
 {
    if((Arr == NULL ) || (iSize <= 0))
    {
        printf("Invalid input ");
        return -1;
    }

    int i = 0, iMax = 0;

    iMax = Arr[0];
    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] > iMax)
        {
            iMax = Arr[i];
        }
    }

    return iMax;
 }

 int main()
 {
    int iLength = 0, iCnt = 0, iRet = 0;
    int *ptr = NULL;

    printf("Enter number of elements \n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter elements\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    iRet = Maximum(ptr,iLength);
     printf("Maximum number is %d\n",iRet);

    return 0;
 }