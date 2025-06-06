// Accept N numbers from user and return difference between frequency of even number and odd numbers.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program2.c
// Description :  Accept N numbers from user and return difference between frequency of even number and odd numbers.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
 Input : N : 7
         Elements : 85 66 3 80 93 88 90
 Output: 1 (4 -3)
 */

 #include<stdio.h>
 #include<stdlib.h>

 int Frequency(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return FALSE;
    }
    
    int i = 0, iCountEven = 0, iCountOdd = 0 ;

    for(i = 0; i < iSize; i++)
    {
        if((Arr[i] % 2) == 0)
        {
            iCountEven++;
        }
        else
        {
            iCountOdd++;
        }
    }

    return (iCountEven - iCountOdd);

 }

 int main()
 {
    int iLength = 0, iRet = 0, iCnt = 0;
    int *ptr =NULL;

    printf("Enter number of elemets\n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory ");
        return -1;
    }

    printf("Enter elements :\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    iRet = Frequency(ptr,iLength);

    printf("Difference between frequency  of even number and odd number  is :%d\n",iRet);

    free(ptr);

    ptr ==NULL;

    return 0;
 }