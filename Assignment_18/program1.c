// Accept N numbers from user and return difference between summation of even elements and summation of odd elements.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept N numbers from user and return difference between summation of even elements and summation of odd elements.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 85 66 3 80 93 88
 Output: 53 (234 - 181)
 */

 #include<stdio.h>
 #include<stdlib.h>

 int Difference(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0))
    {
        printf("Invalid input");
        return -1;
    }
    int iCnt = 0, sumEven = 0, sumOdd = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            sumEven = sumEven + Arr[iCnt];
        }
        else
        {
            sumOdd = sumOdd + Arr[iCnt];
        }
    }

    return (sumEven - sumOdd);

 }

 int main()
 {
    int iLength = 0, iRet = 0, iCnt = 0;
    int *ptr = NULL;

    printf("Enter number of elements\n");
    scanf("%d",&iLength);

    ptr = (int *) malloc(iLength * sizeof(int));

    if(NULL == ptr)
    {
        printf("Unable to allocate memory");
        return -1;
    }
   
    printf("Enter elements :\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    iRet = Difference(ptr,iLength);

    printf("Result is %d\n",iRet);

    free(ptr);

    return 0;


 }

