// Accept N numbers from user and return frequency of even numbers

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program1.c
// Description :  Accept N numbers from user and return frequency of even numbers
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
 Input : N : 6
         Elements : 85 66 3 80 93 88
 Output: 3
 */

 #include<stdio.h>
 #include<stdlib.h>

 int CountEven(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return FALSE;
    }
    
    int i = 0, iCount = 0;

    for(i = 0; i < iSize; i++)
    {
        if((Arr[i] % 2) == 0)
        {
            iCount++;
        }
    }

    return iCount;

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

    iRet = CountEven(ptr,iLength);

    printf("Frequency of even number is :%d\n",iRet);

    free(ptr);

    ptr ==NULL;

    return 0;
 }