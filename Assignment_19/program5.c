// Accept N numbers from user and accept one another number as NO , return frequency of NO form it

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept N numbers from user and accept one another number as NO , return frequency of NO form it
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////

/*
 Input : N : 6
         No : 66
         Elements : 85 66 3 66 93 88 
 Output: 2

 Input : N : 6
         No: 12
         Elements : 85 11 3 11 93 111 
 Output: 0

 */

 #include<stdio.h>
 #include<stdlib.h>

 int Frequency(int Arr[], int iSize, int iNo)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return FALSE;
    }
    
    int i = 0, iCount = 0;

    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] == iNo)
        {
            iCount++;
        }
       
    }

    return iCount;

 }

 int main()
 {
    int iLength = 0, iRet = 0, iCnt = 0, iValue = 0;
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

    printf("Enter number to get frequency of that number\n");
    scanf("%d",&iValue);

    iRet = Frequency(ptr,iLength,iValue);

    printf("Frequency of %d is  :%d\n",iValue,iRet);

    free(ptr);

    ptr ==NULL;

    return 0;
 }