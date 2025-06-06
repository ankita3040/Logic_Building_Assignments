// Accept N numbers from user and return product of all odd elements.

///////////////////////////////////////////////////////////////////////////////
// File Name   :  program5.c
// Description :  Accept N numbers from user and return product of all odd elements.
// Autor       :  Ankita Anil Patil
// Date        :  31/05/2025
///////////////////////////////////////////////////////////////////////////////


/*
 Input : N : 6
         Elements : 15 66 3 68 92 88
 Output: 45

 Input : N : 6
         Elements : 12 66 44 68 92 88
 Output: 0

 */

 #include<stdio.h>
 #include<stdlib.h>

 int Product(int Arr[], int iSize)
 {
    if((Arr == NULL) || (iSize <= 0 ))
    {
        printf("Invalid input ");
        return -1;
    }
    int i = 0, iMul = 1;

    for(i = 0; i < iSize; i++)
    {
        if((Arr[i] % 2) != 0)
        {
            iMul = iMul * Arr[i];
        }
        
    }

    return iMul;

 }

 int main()
 {
    int iLength = 0, iCnt = 0, iRet = 0;
  
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

    iRet = Product(ptr,iLength);

    if(iRet == 1)
    {
        printf(" 0\n");
    }
    else
    {
        printf("Product of all elements is %d\n",iRet);  
    }
    

    free(ptr);


    return 0;
 }