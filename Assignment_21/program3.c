// Accept N numbers from user and return the difference between largest and smallest number

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program3.c
// Description :  Accept N numbers from user and return the difference between largest and smallest number
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 85 66 3 66 93 88
 Output: 90(93-3)

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

    int i = 0, iMax = 0, iMin = 0;

    iMax = Arr[0];
    iMin = Arr[0];

    for(i = 1; i < iSize; i++)
    {
        if(iMin > Arr[i])
        {
            iMin = Arr[i];
        }

        if(iMax < Arr[i])
        {
            iMax = Arr[i];
        }

    }
    return (iMax - iMin);

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
        printf("Enter element %d :",iCnt+1);
        scanf("%d",&ptr[iCnt]);
    }

    iRet = Difference(ptr,iLength);
    printf("Difference between maximum and minimum is %d\n",iRet);

    free(ptr);

    return 0;
 }